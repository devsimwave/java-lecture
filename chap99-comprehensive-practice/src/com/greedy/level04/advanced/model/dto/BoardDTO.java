package com.greedy.level04.advanced.model.dto;

import java.io.*;
import java.util.*;

public class BoardDTO implements Serializable{

	
	private static final long serialVersionUID = -5219066150385199445L;
	
	private int boardNO;
	private String boardTitle;
	private String boardWriter;
	private Date boardDate;
	private String boardContent;
	private int readCount;
	
	public BoardDTO() {}

	
	
	public BoardDTO(int boardNO, String boardTitle, String boardWriter, Date boardDate, String boardContent,
			int readCount) {
		super();
		this.boardNO = boardNO;
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardDate = boardDate;
		this.boardContent = boardContent;
		this.readCount = readCount;
	}



	public int getBoardNo() {
		return boardNO;
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public Date getBoardDate() {
		return boardDate;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public int getReadCount() {
		return readCount;
	}

	public void setBoardNO(int boardNO) {
		this.boardNO = boardNO;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public void setBoardDate(Date boardDate) {
		this.boardDate = boardDate;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}

	@Override
	public String toString() {
		return "번호 : " + boardNO + "/ 제목: " + boardTitle + "/ 작성자 " + boardWriter
				+ "/ 날짜: " + boardDate + "/ 내용: " + boardContent + "/ 조회수: " + readCount +  "]";
	}
	
	
	
}
