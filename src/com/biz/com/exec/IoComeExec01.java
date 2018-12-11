package com.biz.com.exec;

import com.biz.com.service.IoComeService01;

public class IoComeExec01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strname = "src/com/biz/com/exec/매입매출장.txt";
		IoComeService01 icS = new IoComeService01(strname);
		
		icS.readFile();
		icS.showIoList();
	}

}
