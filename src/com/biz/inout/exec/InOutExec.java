package com.biz.inout.exec;

import com.biz.inout.service.InOutService;

public class InOutExec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String strinout = "src/com/biz/inout/vo/iolist.txt";
		InOutService ios = new InOutService(strinout);
		
		ios.readFile();
		ios.printInOut();
		
	}

}
