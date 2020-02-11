package com.calculator;

public class CalcOperators {
	private int operator1=0;
	private int operator2=0;
    private int res=0;
	public int getOper1() {
		return operator1;
	}
	public void setOper1(int oper1) {
		this.operator1 = oper1;
	}
	public int getOper2() {
		return operator2;
	}
	public void setOper2(int oper2) {
		this.operator2 = oper2;
	}
	public void add() {
		res=this.operator1+this.operator2;
	}
	public void sub() {
		res=this.operator1-this.operator2;
	}
	public void mul() {
		res=this.operator1*this.operator2;
	}
	public void div() {
		res=this.operator1/this.operator2;
	}
	public int getRes() {
		return res;
	}
	public void setRes(int res) {
		this.res=res;
	}
}
