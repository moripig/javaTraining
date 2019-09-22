// 카카오 두번째 구현문제

package javaTraining;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		String word;
		
		System.out.println("괄호로만 이루어진 문자열을 입력하시오.");
		word = scan.nextLine();
		
		Trans(word);
		
	}
	public static void Trans(String word) {
		if(word == null) {
			return;
		}
		else {
			int parCount = 0; // 괄호 갯수를 세기 위한 변수
			String u; // 분리한 첫번째 문자열
			String v; // 분리한 두번째 문자열
			
			for(int i = 0; i < word.length(); i++) {
				
				if(i != 0 && parCount == 0) {
					u = word.substring(0,i);
					v = word.substring(i,word.length()-1);
				}
				
				if(word.charAt(i) == '(') {
					parCount++;
				}
				else if(word.charAt(i) == ')') {
					parCount--;
				}
				else if(word.charAt(i) == ' ') {
					System.out.println("괄호로만 이루어진 문자열이 아닙니다.");
				}
			}
		}
	}

}
