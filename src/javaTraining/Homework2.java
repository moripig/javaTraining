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
		
		solution(word);
		
	}
	public static void solution(String word) {
		if(word == null) {
			System.out.println();
		}
		else {
			String[] array;
			array = new String[500];
			
			int arrayCount = 0;
			int parCount = 0; // 괄호 갯수를 세기 위한 변수
			
			array[0] = word;
			
			for(int i = 0; i < word.length(); i++) {
				
				if(i != 0 && parCount == 0) {
					array[arrayCount+1] = array[arrayCount].substring(i,word.length()-1);
					array[arrayCount] = array[arrayCount].substring(0,i);
					arrayCount++;
				}
				
				else if(word.charAt(i) == '(') {
					parCount++;
				}
				else if(word.charAt(i) == ')') {
					parCount--;
				}
				else if(word.charAt(i) == ' ') {
					System.out.println("괄호로만 이루어진 문자열이 아닙니다.");
				}
			}
			for(int a = 0; a < arrayCount; a++) {
				System.out.println(array[a]);}
			System.out.println(parCount);
		}
		System.out.println("solution end");
	}

}
