package com.greedy.level04.advanced.controller;

import java.util.ArrayList;
import java.util.Comparator;

import com.greedy.level04.advanced.model.dao.BoardDao;
import com.greedy.level04.advanced.model.dto.BoardDTO;
import com.greedy.level04.advanced.view.ResultPrinter;

public class BoardManager {

	private BoardDao bd = new BoardDao();
	private ResultPrinter rp = new ResultPrinter();

	/* 새 게시물 등록용 메소드 */
	public void insertBoard(BoardDTO b) {
		/* 글 번호를 0으로 초기화 */
		int boardNo = 0;
		/* 파일에 기록된 리스트 조회 */
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 조회 내역이 있는지 확인 */
		if (list == null) {
			/* 조회 내역이 없는 경우 새로운 리스트 생성 */
			list = new ArrayList<BoardDTO>();
			/* 글 번호를 1로 변경 */
			boardNo++;
		} else {
			/* 조회 내역이 있는 경우 기존 리스트의 마지막 인덱스의 글 번호 조회 */
			boardNo = list.get(list.size() - 1).getBoardNo() + 1;
		}
		/* 입력하려는 board 객체에 boardNo변경 */
		b.setBoardNO(boardNo);
		/* 리스트에 board객체 추가 */
		list.add(b);
		/* 리스트를 파일에 기록 후 결과값 정수로 리턴 */
		int result = bd.writeBoardList(list);
		/* 성공 실패 여부에 따라 뷰페이지 결정 */
		if (result > 0) {
			rp.successPage("insertBoard");
		} else {
			rp.errorPage("insertBoard");
		}
	}

	/* 게시물 전체 조회용 메소드 */
	public void selectAllList() {

		rp.printAllList(bd.readBoardList());

	}

	public void selectOneBoard(int boardNo) {
		/* 전체 게시물을 조회 */
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 일치하는 board 정보를 담을 레퍼런스 변수 초기화 */
		BoardDTO selectedBoard = null;
		/* 조회에 성공하면 게시물 번호와 일치하는 게시물을 리스트에서 탐색 */
		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				/* 일치하는 게시물 번호의 글을 board레퍼런스에 담기 */
				if (list.get(i).getBoardNo() == boardNo) {
					selectedBoard = list.get(i);
					/* 조회수 1증가 */
					list.get(i).setReadCount(list.get(i).getReadCount() + 1);
					break;
				}
			}
		}
		/* 일치하는 게시물이 없으면 에러 출력, 있으면 파일에 다시 기록 후 조회한 게시물 출력 */
		if (selectedBoard == null) {
			rp.errorPage("selectOne");
		} else {
			/* 변경된 리스트 다시 파일에 기록 */
			bd.writeBoardList(list);

			rp.printBoard(selectedBoard);
		}

	}

	public void updateboardTitle(int boardNo, String title) {
		/* 전체 리스트 조회 */
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 결과를 컨트롤할 변수 선언 */
		int result = 0;

		/* 일치하는 게시물 탐색 */
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getBoardNo() == boardNo) {
				/* 탐색 결과가 있는 경우 제목 수정 */
				list.get(i).setBoardTitle(title);
				/* 수정 후 다시 파일에 리스트 저장 */
				result = bd.writeBoardList(list);
				break;
			}
		}
		
		/* 결과에 따른 화면 연결*/
		if(result > 0) {
			rp.successPage("updateTitle");
		} else {
			rp.errorPage("updateTitle");
		}
	}

	public void updateBoardContent(int boardNo, String content) {
		/* 전체 게시물 조회*/
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 결과를 컨트롤할 변수 선언*/
		int result =0;
		
		/* 게시물 탐색하여 글 번호와 일치하는 게시물 탐색*/
		for(int i = 0; i < list.size(); i++) {
			if(list.get(i).getBoardNo() == boardNo) {
				list.get(i).setBoardContent(content);
				result = bd.writeBoardList(list);
				break;
			}
		}
	
		if(result > 0) {
			rp.successPage("updateContent");
		} else {
			rp.errorPage("updateContent");
		}
	
	
	}

	/* 게시물 삭제용 메소드*/
	public void deleteBoard(int boardNo) {
		/* 전체 게시물 조회*/
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 성공 실패 여부를 담을 변수 선언*/
		int result = 0;
		
		for(int i = 0; i < list.size(); i++) {
			/* 일치하는 게시물이 있는 경우 삭제*/
			if(list.get(i).getBoardNo() == boardNo) {
				list.remove(i);
				/* 삭제 후 파일에 기록*/
				result = bd.writeBoardList(list);
				break;
			}
		
		}
		
		if(result > 0) {
			rp.successPage("deleteBoard");
		} else {
			rp.errorPage("deletBoard");
		}
	}
	
	public void noSearchResult() {
		System.out.println("검색결과가 없습니ㅏ.");
	}

	public void searchBoard(String title) {
		/* 전체 게시물 조회*/
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 검색 결과를 담을 리스트 생성*/
		ArrayList<BoardDTO> searchList = new ArrayList<BoardDTO>();
		
		/* 제목을 포함하고 있는 게시물을 결과 리스트에 저장*/
		for(int i = 0; i < list.size(); i++) {
			/* 검색하려는 텍스트와 제목이 일치하는 문자가 있는 경우*/
			if(list.get(i).getBoardTitle().contains(title)) {
				/* 검색 결과를 담을 리스트에 추가*/
				searchList.add(list.get(i));
			}
			
		}
	
		/* 검색결과 리스트가 비어 있는 경우 에러출력, 비어 있지 않은 경우 결과 출력*/
		if(searchList.isEmpty()) {
			rp.noSearchResult();
		} else {
			rp.printAllList(searchList);
		}
	
	}

	public void sortList(Comparator<BoardDTO> c) {
		/* 리스트 전체 조회*/ 
		ArrayList<BoardDTO> list = bd.readBoardList();
		/* 정렬 */
		list.sort(c);
		/* 출력*/ 
		rp.printAllList(list);
	}

}
