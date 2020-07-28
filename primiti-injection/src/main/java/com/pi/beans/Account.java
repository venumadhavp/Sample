package com.pi.beans;

public class Account {
	private int accno;
	private String accHolderName;
	
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accHolderName=" + accHolderName + "]";
	}
	
	

}
