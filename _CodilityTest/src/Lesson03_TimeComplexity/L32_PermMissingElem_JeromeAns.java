package Lesson03_TimeComplexity;

// you can also use imports, for example:
import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class L32_PermMissingElem_JeromeAns {
	
	public int solution(int[] A) {
		// write your code in Java SE 8
		int n = A.length+1;
		Arrays.sort(A);;
		for (int i=1; i<n; i++) {
			if(i != A[i-1]) {
				n = i;
				break;
			}
		}
		return n;
	}
	
	// print test case 
	public static void main(String[] args) {
		L32_PermMissingElem_JeromeAns test = new L32_PermMissingElem_JeromeAns();
		int[] array = {2, 3, 1, 5};
		System.out.println(test.solution(array));
	}
}
