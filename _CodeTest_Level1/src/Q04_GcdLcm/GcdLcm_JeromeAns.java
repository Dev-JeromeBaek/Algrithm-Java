package Q04_GcdLcm;

import java.util.Arrays;

public class GcdLcm_JeromeAns {
	
	/*
	 * Quiz 04 - 최대공약수와 최소공배수
     * 
     * 두 수를 입력받아 두 수의 최대공약수와 최소공배수를 반환해주는 gcdlcm 함수를 완성해 보세요.
     * 배열의 맨 앞에 최대공약수, 그 다음 최소공배수를 넣어 반환하면 됩니다.
     * 
     * 예를들어 gcdlcm(3,12)가 입력되면, [3, 12]를 반환해주면 됩니다.
	 */
	
	public int[] gcdlcm(int a, int b) {
		int[] answer = new int[2];
		
		int big, small;				// 큰값, 작은값
		int quotient, remainder;	// 몫, 나머지
		int gcm, lcm;				// 최대공약수, 최소공배수
		
		if(a>=b) {
			big = a; small = b;
		} else {
			big = b; small = a;
		}
		while(true) {
			System.out.println("big : " + big + ", small : " + small);
			quotient = big/small;
			System.out.println("몫 : " + quotient);
			remainder = big-quotient*small;	// big % small
			System.out.println("나머지 : " + remainder);
			
			if(remainder == 0) {
				gcm = small;
				lcm = (a*b)/gcm;
				System.out.println(a + ", " + b + "의 최대공약수 : " + gcm);
				System.out.println(a + ", " + b + "의 최소공배수 : " + lcm);
				break;
			}
			big = small;
			small = remainder;
		}
		answer[0] = gcm;
		answer[1] = lcm;
		return answer;
	}// gcdlcm END
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		GcdLcm_JeromeAns c = new GcdLcm_JeromeAns();
		
		System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
	}// main END
	
}// class END
