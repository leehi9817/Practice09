package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
    	
    	//ArrayList 생성
    	List<Friend> fList = new ArrayList<Friend>();
    	
    	System.out.println("친구를 3명 등록해 주세요");
    	
    	//3번 반복
    	for(int i=0; i<3; i++) {	
    		//정보 입력 받기
    		String s = sc.nextLine();
    		
    		//공백 단위로 split
    		String[] sArray = s.split(" ");
    		
    		//Friend 객체 생성
    		Friend f = new Friend(sArray[0], sArray[1], sArray[2]);
    	
    		//ArrayList에 저장
    		fList.add(f);
    		
    	}
    	//전부 출력
    	for(Friend f : fList) {
    		System.out.println("이름:" + f.getName() + " 핸드폰:" + f.getHp() + " 학교:" + f.getSchool());
    	}
    	
    	sc.close();
    	
    }

}
