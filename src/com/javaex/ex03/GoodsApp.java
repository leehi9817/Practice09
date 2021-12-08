package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	List<Goods> gList = new ArrayList<Goods>();
    	
    	System.out.println("상품을 입력해주세요(종료 q)");
    	
    	//반복 수가 정해지지 않음
    	while(true) {
    		
    		String s = sc.nextLine();
    		
    		//q 입력되면 종료
    		if(s.equals("q")) {
    			break;
    		}
    		
    		//, 단위로 나누어서 배열에 넣기
    		String[] sArray = s.split(",");

    		String name = sArray[0];
    		int price = Integer.parseInt(sArray[1]);
    		int count = Integer.parseInt(sArray[2]);
    		
    		//Goods 객체 생성
    		//문자열인 sArray[1], [2]를 int로 변환하여 넣기
    		Goods g = new Goods(name, price, count);
    		
    		//ArrayList에 저장
    		gList.add(g);
    	}
    	
		System.out.println("[입력완료]");
		System.out.println("==================");
    	
    	//리스트 전체 출력
		for(Goods g : gList) {
			System.out.println(g.getName() + "(가격:" + g.getPrice() + "원)이 " + g.getCount() + " 개 입고 되었습니다.");
		}
    	
		//전체 상품 개수 구하기
		int sum = 0;
		
		for(Goods g : gList) {
			sum += g.getCount();
		}
		
		System.out.println("모든 상품의 갯수는 " + sum + "개입니다.");
		
    	sc.close();
       
    }

}
