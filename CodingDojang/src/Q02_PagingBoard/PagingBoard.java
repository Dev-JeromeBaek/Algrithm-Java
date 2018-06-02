package Q02_PagingBoard;

import java.util.Scanner;

public class PagingBoard {

	/*
	 * Q 02 - �Խ��� ����¡
	 * 
	 * [����]
	 * A���� �Խ��� ���α׷��� �ۼ��ϰ� �ִ�.
	 * A���� �Խù��� �� �Ǽ��� �� �������� ������ �Խù����� �Է����� �־��� �� 
	 * �� ���������� �����ϴ� ���α׷��� �ʿ��ϴٰ� �Ѵ�.
	 * 
	 * �Է� : �� �Ǽ�(m), �� �������� ������ �Խù� ��(n) (�� n�� 1���� ũ�ų� ����. n >=1)
	 * ��� : �� ������ ��
	 * 
	 * A���� �ʿ��� ���α׷��� �ۼ��Ͻÿ�
	 * 
	 * ��) ���α׷� ���� �� ������ ���� ������� ���;� ��.
	 * 
	 * m   n   ���
	 * 0   1    0
	 * 1   1    1
	 * 2   1    2
	 * 1   10   1
	 * 10  10   1
	 * 11  10   2
	 * 
	 */
	
	int totalPage(int m, int n) {
		int result = 0;
		if(n>=m) {
			result = 1;
		} else {
			int quotient = m/n;
			int remainder = m%n;
			result = remainder > 0 ? quotient+1 : quotient;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�ѰǼ�, �������� ������ �Խù��� �Է� (ex 14 5");
		int m = scan.nextInt();
		int n = scan.nextInt();
		PagingBoard test = new PagingBoard();
		System.out.println(test.totalPage(m, n));
	}
	
}
