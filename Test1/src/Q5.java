public class Q5 {
	
	public int solution(int[] A, int K, int L) {
		int result = 0;
		
		int totalTree = A.length;	// ������ �� ����
		int big = 0;				// ���� ���� ����
		int small = 0;				// ���� ���� ����
		
		int best = 0;				// �ְ��� ���� ���� index
		
		// int[] array = {6, 1, 4, 6, 3, 2, 7, 4}; 8��
		// 1. ������ ������ Alice�� Bob�� ���ϴ� ������ŭ���� check
		
		if(totalTree > K+L) {
			if(K>L) {
				big = K; small = L;
			} else {
				big = L; small = K;
			}
			int prev = 0;
			int next = 0;
			for (int i=0; i<=totalTree-big; i++) {
				next = 0;
				for (int j=i; j<big+i; j++) {
					next += A[j];
//					System.out.println("j : " + j);
//					System.out.println("next = " + next);
				}
				if(next > prev) {
					prev = next;
					best = i;
				}
			}
//			System.out.println("big prev : " + prev);
//			System.out.println("best : " + best);
			int[] tempArr = new int[totalTree];
//			System.out.println("tempArr.length : " + tempArr.length);
			for (int i=0; i<totalTree; i++) {
				if(i < best || i > best+big-1) {
					tempArr[i] = A[i];
				} else {
					tempArr[i] = 0;
				}
			}
//			System.out.println(Arrays.toString(tempArr));
			result = prev;
//			System.out.println("prev result : " + result);
			prev = 0;
			next = 0;
//			System.out.println("tempArr.length-small : " + (tempArr.length-small));
			for (int i=0; i<=totalTree-small; i++) {
				if(tempArr[i] != 0) {
					next = 0;
					for (int j=i; j<small+i; j++) {
						next += tempArr[j];
//						System.out.println("j : " + j);
//						System.out.println("next : " + next);
					}
					if(next > prev) {
						prev = next;
					}
				}
			}
//			System.out.println("small prev : " + prev);
			result += prev;
//			System.out.println("fianl result : " + result);
			
			
		// ���� ������ ��Ȯ�� ���� ���
		} else if (totalTree == K+L) {
			for (int each : A) result += each;
		
		// ���� ������ �����ϹǷ� ��� -1 ��ȯ
		} else {
			result = -1;
		}
		return result;
	}
	
	public static void main(String[] args) {
		Q5 q = new Q5();
		int[] array = {6, 1, 4, 6, 3, 2, 7, 4};
		int K = 3;
		int L = 2;
		
		int[] array2 = {10, 19, 15};
		int K2 = 2;
		int L2 = 2;
		
		int[] array3 = {6, 1, 4, 6, 3, 2, 7, 4, 2, 4, 6, 7, 8, 9, 6, 400, 3, 2, 1};
		int K3 = 5;
		int L3 = 8;
		System.out.println(q.solution(array, K, L));
		System.out.println(q.solution(array2, K2, L2));
		System.out.println(q.solution(array3, K3, L3));
	}// main END
}// class END