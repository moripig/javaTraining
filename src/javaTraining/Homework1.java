// 백준 사이트 1152번, 문자열 내 단어의 갯수 구하기

package javaTraining;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		int count = 0;
	    String word;
	        
	    System.out.println("문자열 입력 : ");
	    word = scan.nextLine();        
	       
	    for(int i = 0; i < word.length(); i++) { // 문자열에 공백이 있을때마다 count가 1 증가
	    	if(word.charAt(i) == ' ') {
	    		count++;                
	        }
	    }
	    System.out.println(count);
	}

}
