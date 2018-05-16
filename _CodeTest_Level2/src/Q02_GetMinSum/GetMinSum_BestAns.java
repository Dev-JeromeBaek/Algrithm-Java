package Q02_GetMinSum;

public class GetMinSum_BestAns {
	
	/*
	 * Q 02 - 최솟값 만들기
	 * 
	 * 자연수로 이루어진 길이가 같은 수열 A,B가 있습니다.
	 * 최솟값 만들기는 A, B에서 각각 한개의 숫자를 뽑아 두 수를 곱한 값을 누적하여 더합니다.
	 * 이러한 과정을 수열의 길이만큼 반복하여 최종적으로 누적된 값이 최소가 되도록 만드는 것이 목표입니다.
	 * 
	 * 예를 들어 A = [1, 2], B = [3, 4] 라면
	 * 1. A에서 1, B에서 4를 뽑아 곱하여 더합니다.
	 * 2. A에서 2, B에서 3을 뽑아 곱하여 더합니다.
	 * 
	 * 수열의 길이만큼 반복하여 최솟값 10을 얻을 수 있으며, 이 10이 최솟값이 됩니다.
	 * 수열 A,B가 주어질 때, 최솟값을 반환해주는 getMinSum 함수를 완성하세요.
	 * 
	 */
	
	public int getMinSum(int []A, int []B)
    {
		int answer = 0;
        int sort = 0;

        if(A.length != B.length) { return -1; }

        // A배열은 작은 순으로, B배열은 큰순으로
        for(int i = 0; i < A.length-1; i++) {        
        	for(int j = i+1; j < A.length; j++) {
        		if(A[i] > A[j]) { sort = A[i]; A[i] = A[j]; A[j] = sort; }
        		if(B[i] < B[j]) { sort = B[i]; B[i] = B[j]; B[j] = sort; }
        	}
        }

        // 누적
        for(int k = 0; k < A.length; k++) {
        	answer += A[k]*B[k];
        }

        return answer;
    }
	
    public static void main(String[] args)
    {
    	GetMinSum_BestAns test = new GetMinSum_BestAns();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }

}
