package com.greedy.section01.conditional_statement;


public class Application {

	public static void main(String[] args) {
		
		A_if a = new A_if();
		B_IfElse ifElse = new B_IfElse();
		C_ifElseif ifElseIf = new C_ifElseif();
		D_switch swch = new D_switch();
		
		
		
		a.testSimpleIfStatement();
		a.testNestedIfstatement();
	
		ifElse.testSimpleIfElseStatement();
		
		ifElse.testNestedIfElseStatement();
		
		ifElseIf.testNestedIfElseIfstatement();
		
		swch.testSimpleSwitchStatement();
		swch.testSwitchVendingMachine();
	
	}

}
