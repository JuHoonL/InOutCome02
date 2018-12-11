package com.biz.com.vo;

public class IoListVO {

	private String strDate;
	private int intIO;
	private String strCName;
	private int intprice;
	private int intQuan;
	
	private int intInSum;
	private int intOutSum;
	
	
	public int getIntInSum() {
		return intInSum;
	}
	public void setIntInSum(int intInSum) {
		this.intInSum = intInSum;
	}
	public int getIntOutSum() {
		return intOutSum;
	}
	public void setIntOutSum(int intOutSum) {
		this.intOutSum = intOutSum;
	}
	public String getStrDate() {
		return strDate;
	}
	public void setStrDate(String strDate) {
		this.strDate = strDate;
	}
	public int getIntIO() {
		return intIO;
	}
	public void setIntIO(int intIO) {
		this.intIO = intIO;
	}
	public String getStrCName() {
		return strCName;
	}
	public void setStrCName(String strCName) {
		this.strCName = strCName;
	}
	public int getIntprice() {
		return intprice;
	}
	public void setIntprice(int intprice) {
		this.intprice = intprice;
	}
	public int getIntQuan() {
		return intQuan;
	}
	public void setIntQuan(int intQuan) {
		this.intQuan = intQuan;
	}
	@Override
	public String toString() {
		return "IoListVO [strDate=" + strDate + ", intIO=" + intIO + ", strCName=" + strCName + ", intprice=" + intprice
				+ ", intQuan=" + intQuan + ", intInSum=" + intInSum + ", intOutSum=" + intOutSum + "]";
	}

	
	
	
	
}
