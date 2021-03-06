package Lesson03_TimeComplexity;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class L31_Frogjmp_JeromeAns2 {
	
	public int solution(int X, int Y, int D) {
		// write your code in Java SE 8
		Y -= X;
		int count = 0;
		int quotient = Y/D;
		int remainder = Y%D;
		System.out.println(quotient);
		System.out.println(remainder);
		count = remainder==0 ? quotient : quotient+1;
		return count;
	}
	
	// TestCase Method
	public static void main(String[] args) {
		L31_Frogjmp_JeromeAns2 test = new L31_Frogjmp_JeromeAns2();
		int X, Y, D;
		X = 50; Y = 199; D = 4;
		System.out.println(test.solution(X, Y, D));
	}
	// 100%
}
