package Q04_GcdLcm;

import java.util.Arrays;

public class GcdLcm_BestAns {
	
	/*
	 * Quiz 04 - �ִ������� �ּҰ����
     * 
     * �� ���� �Է¹޾� �� ���� �ִ������� �ּҰ������ ��ȯ���ִ� gcdlcm �Լ��� �ϼ��� ������.
     * �迭�� �� �տ� �ִ�����, �� ���� �ּҰ������ �־� ��ȯ�ϸ� �˴ϴ�.
     * 
     * ������� gcdlcm(3,12)�� �ԷµǸ�, [3, 12]�� ��ȯ���ָ� �˴ϴ�.
	 */
	
    public int[] gcdlcm(int a, int b) {
    	int[] answer = new int[2];
    	
        answer[0] = gcd(a,b);
        answer[1] = (a*b)/answer[0];
        
        return answer;
    }

	public static int gcd(int p, int q) {
		if (q == 0) return p;
		return gcd(q, p%q);
	}

    // �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
    public static void main(String[] args) {
    	GcdLcm_BestAns c = new GcdLcm_BestAns();
        System.out.println(Arrays.toString(c.gcdlcm(3, 12)));
    }
	
}// class END
