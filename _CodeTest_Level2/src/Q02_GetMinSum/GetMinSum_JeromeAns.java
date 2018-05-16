package Q02_GetMinSum;

import java.util.Arrays;

public class GetMinSum_JeromeAns {
	
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
        int[] intArr = new int[A.length];
        int lastIndex = A.length-1;
        
        Arrays.sort(A);
        Arrays.sort(B);
        
        for(int i=0; i<A.length; i++) {             
            intArr[i] = A[i] * B[lastIndex-i];
            answer += intArr[i];
        }       
        return answer;
    }
    public static void main(String[] args)
    {
    	GetMinSum_JeromeAns test = new GetMinSum_JeromeAns();
        int []A = {1,2};
        int []B = {3,4};
        System.out.println(test.getMinSum(A,B));
    }

}