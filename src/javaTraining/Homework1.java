// ���� ����Ʈ 1152��, ���ڿ� �� �ܾ��� ���� ���ϱ�

package javaTraining;

import java.util.Scanner;

public class Homework1 {

	public static void main(String[] args) {

	Scanner scan = new Scanner(System.in);
		int count = 0;
	    String word;
	        
	    System.out.println("���ڿ� �Է� : ");
	    word = scan.nextLine();        
	       
	    for(int i = 0; i < word.length(); i++) { // ���ڿ��� ������ ���������� count�� 1 ����
	    	if(word.charAt(i) == ' ') {
	    		count++;                
	        }
	    }
	    System.out.println(count);
	}

}