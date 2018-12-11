package com.biz.com.service;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.biz.com.vo.IoListVO;

public class IoComeService01 {

	List<IoListVO> ioList ;
	String strFilename;
	
	public IoComeService01(String strFilename) {
		ioList = new ArrayList();
		this.strFilename = strFilename ;
	}
	
	public void readFile() {
		FileReader fr;
		BufferedReader br;
		
		try {
			fr = new FileReader(strFilename);
			br = new BufferedReader(fr);
			while(true) {
				String strR = br.readLine();
				if(strR == null) break;
				String[] splitR = strR.split(":");
				IoListVO vo = new IoListVO();
				vo.setStrDate(splitR[0]);
				vo.setIntIO(Integer.valueOf(splitR[2]));
				vo.setStrCName(splitR[1]);
				vo.setIntprice(Integer.valueOf(splitR[3]));
				vo.setIntQuan(Integer.valueOf(splitR[4]));
				
				
				ioList.add(vo);
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
	
	public void showIoList() {
		System.out.println("==================================================================================================");
		System.out.printf("%s\t\t%s\t%12.5s\t\t%s\t%s\t%s\t\t%s\n","거래일자","구분","상품명","단가","수량","매입금액","매출금액");
		System.out.println("--------------------------------------------------------------------------------------------------");
	
		int Len = ioList.size();
		int intSumin = 0;
		int intSumout = 0;
		for(IoListVO o : ioList) {
			int intInSum = 0;
			int intOutSum = 0;
			if(o.getIntIO() == 0) {
				intInSum = o.getIntprice() * o.getIntQuan();
				o.setIntInSum(intInSum);
				o.setIntOutSum(intOutSum);
				intSumin += o.getIntInSum();
				
			} else {
				intOutSum = o.getIntprice() * o.getIntQuan();
				o.setIntInSum(intInSum);
				o.setIntOutSum(intOutSum);
				intSumout += o.getIntOutSum();
			}
		}
		
		for(IoListVO vo : ioList) {
			if(vo.getIntIO() == 0) {
				System.out.printf("%s\t%s\t%12.5s\t\t%d\t%d\t%d\t\t%d\n",
						vo.getStrDate(),
						"매입",
						vo.getStrCName(),
						vo.getIntprice(),
						vo.getIntQuan(),
						vo.getIntInSum(),
						vo.getIntOutSum()
				);
			} else {
				System.out.printf("%s\t%s\t%12.5s\t\t%d\t%d\t%d\t\t%d\n",
						vo.getStrDate(),
						"매출",
						vo.getStrCName(),
						vo.getIntprice(),
						vo.getIntQuan(),
						vo.getIntInSum(),
						vo.getIntOutSum()
				);
			}
		}
				
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.printf("%s\t\t%s\t%12.5s\t\t%s\t%s\t%s\t%s","","","","","",intSumin,intSumout);
	}
	
	
}
