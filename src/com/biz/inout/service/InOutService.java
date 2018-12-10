package com.biz.inout.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.InOutVO;

public class InOutService {

	List<InOutVO> iOList ;
	String strName ;
	String[] sInOut ;
	
	public InOutService(String strName) {
		iOList = new ArrayList();
		this.strName = strName;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader br;
	
		try {
			fr = new FileReader(this.strName);
			br = new BufferedReader(fr);
			
			while(true) {
				InOutVO vo = new InOutVO();
				String strIO = br.readLine();
				if(strIO == null) break;
				sInOut = strIO.split(":");
					if(sInOut[2].equals("0")) {
						vo.setStrDate(sInOut[0]);
						vo.setStrInout(sInOut[2]);
						vo.setStrPum(sInOut[1]);
						vo.setStrDan(sInOut[3]);
						vo.setStrSu(sInOut[4]);
						vo.setInSum(Integer.valueOf(sInOut[3]) * Integer.valueOf(sInOut[4]));
						iOList.add(vo);
					} else {	
						vo.setStrDate(sInOut[0]);
						vo.setStrInout(sInOut[2]);
						vo.setStrPum(sInOut[1]);
						vo.setStrDan(sInOut[3]);
						vo.setStrSu(sInOut[4]);
						vo.setOutSum(Integer.valueOf(sInOut[3]) * Integer.valueOf(sInOut[4]));
						iOList.add(vo);
					}
			}
			br.close();
			fr.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	

	public void printInOut() {
		System.out.println("======================================================================================================");
		System.out.println("거래일자"+"\t\t\t"+"구분"+"\t"+"상품명"+"\t\t\t\t"+"단가"+"\t\t"+"수량"+"\t"+"매입금액"+"\t\t\t"+"매출금액");
		System.out.println("------------------------------------------------------------------------------------------------------");
		for(InOutVO vo : iOList) {
			if(sInOut[2].equals("0")) {
				System.out.println(
						vo.getStrDate() + "\t\t" 
						+ vo.getStrInout() + "\t"
						+ vo.getStrPum() + "\t\t\t\t"
						+ vo.getStrDan() + "\t\t"
						+ vo.getStrSu() + "\t"
						+ vo.getInSum() + "\t\t\t"
						+ vo.getOutSum()
				);
			} else {
				System.out.println(
						vo.getStrDate() + "\t\t" 
						+ vo.getStrInout() + "\t"
						+ vo.getStrPum() + "\t\t\t\t"
						+ vo.getStrDan() + "\t\t"
						+ vo.getStrSu() + "\t"
						+ vo.getInSum() + "\t\t\t"
						+ vo.getOutSum()
				);
			}
		}
	}
	
}
