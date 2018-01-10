package com.javaex.problem06;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");
        
        // 친구정보 입력받기
        for(int i=0; i<friendArray.length; i++) {
        	String info = sc.nextLine();
        	
        	//입력받은 친구정보를 공백으로 분리 
        	String[] friend = info.split(" ");
        	
        	//Friend 객체 생성하여 데이터 넣기 
        	Friend fr = new Friend();
        	
        	fr.setName(friend[0]);
        	fr.setHp(friend[1]);
        	fr.setSchool(friend[2]);
  
        	 // 배열에 추가하기
        	friendArray[i] = fr; 
        }

       
        // 친구정보 출력
        for (int i = 0; i < friendArray.length; i++) {
           
        	friendArray[i].showInfo();
        }

        sc.close();
    }

}
