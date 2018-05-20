package Lesson02_Arrays;

// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

public class L22_OddOccurrencesInArray_JeromeAns {
	
	public int solution(int[] A) {
        // write your code in Java SE 8
		int result = 0;
		for (int i=0; i<A.length; i++) {
			if(A[i] != -1) {
				for (int j=i; j<A.length; j++) {
					if(i!=j) {
						if (A[i] == A[j]) {
							A[i] = -1;
							A[j] = -1;		
							break;
						}
					}
				}
			}
		}
		for (int each : A) {
			if(each != -1) {
				result = each;
			}
		}
		return result;
    }
	
	public static void main(String[] args) {
		L22_OddOccurrencesInArray_JeromeAns test = new L22_OddOccurrencesInArray_JeromeAns();
		int[] array = {9, 3, 9, 3, 9, 7, 9};
		System.out.println(test.solution(array));
	}
	// 이렇게 풀고 55점 받음.. runtime이 문제.. 다른 방법으로 풀어보자
}
