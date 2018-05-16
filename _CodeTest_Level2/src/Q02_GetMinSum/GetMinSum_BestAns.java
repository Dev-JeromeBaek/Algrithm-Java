package Q02_GetMinSum;

public class GetMinSum_BestAns {
	
	/*
	 * Q 02 - �ּڰ� �����
	 * 
	 * �ڿ����� �̷���� ���̰� ���� ���� A,B�� �ֽ��ϴ�.
	 * �ּڰ� ������ A, B���� ���� �Ѱ��� ���ڸ� �̾� �� ���� ���� ���� �����Ͽ� ���մϴ�.
	 * �̷��� ������ ������ ���̸�ŭ �ݺ��Ͽ� ���������� ������ ���� �ּҰ� �ǵ��� ����� ���� ��ǥ�Դϴ�.
	 * 
	 * ���� ��� A = [1, 2], B = [3, 4] ���
	 * 1. A���� 1, B���� 4�� �̾� ���Ͽ� ���մϴ�.
	 * 2. A���� 2, B���� 3�� �̾� ���Ͽ� ���մϴ�.
	 * 
	 * ������ ���̸�ŭ �ݺ��Ͽ� �ּڰ� 10�� ���� �� ������, �� 10�� �ּڰ��� �˴ϴ�.
	 * ���� A,B�� �־��� ��, �ּڰ��� ��ȯ���ִ� getMinSum �Լ��� �ϼ��ϼ���.
	 * 
	 */
	
	public int getMinSum(int []A, int []B)
    {
		int answer = 0;
        int sort = 0;

        if(A.length != B.length) { return -1; }

        // A�迭�� ���� ������, B�迭�� ū������
        for(int i = 0; i < A.length-1; i++) {        
        	for(int j = i+1; j < A.length; j++) {
        		if(A[i] > A[j]) { sort = A[i]; A[i] = A[j]; A[j] = sort; }
        		if(B[i] < B[j]) { sort = B[i]; B[i] = B[j]; B[j] = sort; }
        	}
        }

        // ����
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
