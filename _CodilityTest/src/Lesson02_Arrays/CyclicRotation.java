package Lesson02_Arrays;

import java.util.Arrays;

public class CyclicRotation {
	
	public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
		int temp = 0;
		for (int i=0; i<K; i++) {
			for (int j=A.length-1; j>=0; j--) {
				if (j == A.length-1) {
					temp = A[j];
				} else {
					A[j+1] = A[j];
					if (j == 0) A[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(A));
		return A;
    }
	
	public static void main(String[] args) {
		CyclicRotation test = new CyclicRotation();
		int[] A = {3, 8, 9, 7, 6};
		int K = 2;
		System.out.println(test.solution(A, K));
	}
}
