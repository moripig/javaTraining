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
		
		Trans(word);
		
	}
	public static void Trans(String word) {
		if(word == null) {
			return;
		}
		else {
			int parCount = 0; // ��ȣ ������ ���� ���� ����
			String u; // �и��� ù��° ���ڿ�
			String v; // �и��� �ι�° ���ڿ�
			
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
					System.out.println("��ȣ�θ� �̷���� ���ڿ��� �ƴմϴ�.");
				}
			}
		}
	}

}
