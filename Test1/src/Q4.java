import java.util.Arrays;

public class Q4 {
	
	public int solution(int A, int B, int C, int D) {
        // write your code in Java SE 8
        int[] intArr = {A, B, C, D};
        Arrays.sort(intArr);
        A = intArr[0];
        B = intArr[1];
        C = intArr[2];
        D = intArr[3];
		
		return (int) Math.sqrt(Math.pow(Math.abs(C-A),2) + Math.pow(Math.abs(D-B), 2))*2;
    }
	
	public static void main(String[] args) {
		Q4 q = new Q4();
		System.out.println(q.solution(1, 1, 2, 3));
		
		System.out.println(q.solution(2, 4, 2, 4));
		
	}// main END
}// class END
