package com.biz.inout.exec;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.inout.vo.InOutVO;

public class InOutExec02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String strinout = "src/com/biz/inout/vo/매입매출.txt";
		String[] sInOut ;
		
		FileReader fr;
		BufferedReader br;
		
		System.out.println("======================================================================================================");
		System.out.println("거래일자"+"\t\t\t"+"구분"+"\t"+"상품명"+"\t\t"+"단가"+"\t\t"+"수량"+"\t"+"매입금액"+"\t\t\t"+"매출금액");
		System.out.println("------------------------------------------------------------------------------------------------------");
		try {
			fr = new FileReader(strinout);
			br = new BufferedReader(fr);
			
			while(true) {
				InOutVO vo = new InOutVO();
				String strIO = br.readLine();
				if(strIO == null) break;
				sInOut = strIO.split(":");
				
				vo.setStrDate(sInOut[0]);
				vo.setStrInout(sInOut[1]);
				vo.setStrPum(sInOut[2]);
				vo.setStrDan(sInOut[3]);
				vo.setStrSu(sInOut[4]);
				vo.setInSum(Integer.valueOf(sInOut[3]) * Integer.valueOf(sInOut[4]));
				vo.setOutSum(Integer.valueOf(sInOut[3]) * Integer.valueOf(sInOut[4]));
				
				if(sInOut[1].equals("1")) {
					System.out.println(
							vo.getStrDate() + "\t\t" 
							+ vo.getStrInout() + "\t"
							+ vo.getStrPum() + "\t\t"
							+ vo.getStrDan() + "\t\t"
							+ vo.getStrSu() + "\t"
							+ vo.getInSum()
					);
				} else {
					System.out.println(
							vo.getStrDate() + "\t\t" 
							+ vo.getStrInout() + "\t"
							+ vo.getStrPum() + "\t\t"
							+ vo.getStrDan() + "\t\t"
							+ vo.getStrSu() + "\t"
							+ "\t\t\t"
							+ vo.getOutSum()
					);
				}
			}
			br.close();
			fr.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
