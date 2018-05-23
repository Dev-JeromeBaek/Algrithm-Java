package Q05_NLCM;

import java.util.Arrays;

public class NLCM_BestAns {
	
	/*
	 * Q 05 - N���� �ּҰ����
	 * 
	 * �� ���� �ּҰ����(Least Common Multiple)�� 
	 * �Էµ� �� ���� ��� �� ������ �Ǵ� ���� ���� ���ڸ� �ǹ��մϴ�.
	 * 
	 * ���� ��� 2�� 7�� �ּҰ������ 14�� �˴ϴ�.
	 * 
	 * ���Ǹ� Ȯ���ؼ�, n���� ���� �ּҰ������  n���� ������ ��� �� 
	 * ������ �Ǵ� ���� ���� ���ڰ� �˴ϴ�.
	 * nlcm�Լ��� ���� n���� ���ڰ� �ԷµǾ��� ��, �ּҰ������ ��ȯ�� �ּ���.
	 * 
	 * ������� [2. 6. 8. 14]�� �Էµȴٸ� 168�� ��ȯ�� �ָ� �˴ϴ�.
	 *  
	 */
	
	public long nlcm(int[] num) {
		long answer = num[0],g;
		for(int i=1;i<num.length;i++){
			g=gcd(answer,num[i]);
			answer=g*(answer/g)*(num[i]/g);
		}
		return answer;
	}
	
	public long gcd(long a,long b){
		if(a>b) return (a%b==0)? b:gcd(b,a%b);
		else return (b%a==0)? a:gcd(a,b%a);
	}
	
	public static void main(String[] args) {
		NLCM_BestAns c = new NLCM_BestAns();
		int[] ex = {2, 6, 8, 14};
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println(c.nlcm(ex));
	}
}
