// īī�� �ι�° ��������

package javaTraining;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner scan = new Scanner(System.in);
		
		String word;
		
		System.out.println("��ȣ�θ� �̷���� ���ڿ��� �Է��Ͻÿ�.");
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
			int parCount = 0; // ��ȣ ������ ���� ���� ����
			
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
					System.out.println("��ȣ�θ� �̷���� ���ڿ��� �ƴմϴ�.");
				}
			}
			for(int a = 0; a < arrayCount; a++) {
				System.out.println(array[a]);}
			System.out.println(parCount);
		}
		System.out.println("solution end");
	}

}
