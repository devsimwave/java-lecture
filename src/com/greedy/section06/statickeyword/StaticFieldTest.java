package com.greedy.section06.statickeyword;

public class StaticFieldTest {
	
	private int nonstaticCount;
	private static int staticCount;		// 프로그램이 시작이 될 때 static키워드를 가진 모든
	
	public StaticFieldTest() {}
	
	public int getNonStaticCount() {
		return this.nonstaticCount;
		
	}
	
	/* static 필드에 접근하기 위해서는 클래스명.필드명으로 점근한다.
	 * this.으로도 접근은 가능하지만 의도하지 않은 방향으로 프로그램이 동작할 수 있기 때문에
	 * this.으로 접근하는 것을 권장하지 않는다.*/
	public int getStaticCount() {
		return StaticFieldTest.staticCount;	// 스태틱 키워드는 클래스명.필드 혹은 .메소드
	}
	
	public void increaseNonstaticCount() {
		this.nonstaticCount++;
	}

	public void increasStaticCount() {
		StaticFieldTest.staticCount++;
	}
	
}
