package Q02_PagingBoard;

import java.util.Scanner;

public class PagingBoard {

	/*
	 * Q 02 - 게시판 페이징
	 * 
	 * [문제]
	 * A씨는 게시판 프로그램을 작성하고 있다.
	 * A씨는 게시물의 총 건수와 한 페이지에 보여줄 게시물수를 입력으로 주었을 때 
	 * 총 페이지수를 리턴하는 프로그램이 필요하다고 한다.
	 * 
	 * 입력 : 총 건수(m), 한 페이지에 보여줄 게시물 수(n) (단 n은 1보다 크거나 같다. n >=1)
	 * 출력 : 총 페이지 수
	 * 
	 * A씨가 필요한 프로그램을 작성하시오
	 * 
	 * 예) 프로그램 수행 시 다음과 같은 결과값이 나와야 함.
	 * 
	 * m   n   출력
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
		
		System.out.println("총건수, 한페이지 보여줄 게시물수 입력 (ex 14 5");
		int m = scan.nextInt();
		int n = scan.nextInt();
		PagingBoard test = new PagingBoard();
		System.out.println(test.totalPage(m, n));
	}
	
}
