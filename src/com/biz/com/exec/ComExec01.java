package com.biz.com.exec;

public class ComExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(getRndDate());
	}

	public static String getRndDate() {
		int[] iMaxDay = {31,28,31,30,31,30,31,31,30,31,30,31};
		int iMonth = (int)(Math.random() * (iMaxDay.length)) + 1;
		
		int iDays = (int)(Math.random() * (iMaxDay[iMonth-1])-1) + 1;
		
		String rndDate = String.format("2018-%02d-%02d", iMonth, iDays);
		
		return rndDate ;
		
	}
}
