package Q05;

import java.util.Scanner;

public class Main {

	/*
	 * ��� ���ϱ�
	 * 
	 * [�ǽ�����]
	 * ���� ������ �Է� �ް� �� ���� ����� ��� ����ϴ� ���α׷��� �ۼ��غ�����.
	 * 
	 * [�Է�]
	 * ���� ����
	 * 
	 * [���]
	 * �Էµ� ���� ����� �������� �����Ͽ� ���
	 * 
	 */
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		String result = "";
		for (int i=1; i<=num/2; i++) {
			if(num%i == 0) result += i+" ";
		}
		System.out.println(result + num + " ");
	}
}