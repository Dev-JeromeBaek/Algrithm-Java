package Q09_GetMinMaxString;

public class GetMinMaxString_BestAns {
	
	/*
	 * Q 09 - �ִ밪�� �ּҰ�
	 * 
	 * getMinMaxString �޼ҵ�� String�� ���� str�� �Ű������� �Է¹޽��ϴ�.
	 * str���� �������� ���е� ���ڵ��� ����Ǿ� �ֽ��ϴ�.
	 * str�� ��Ÿ���� ���� �� �ּҰ��� �ִ밪�� ã�� 
	 * �̸� "(�ּҰ�) (�ִ밪)"������ String�� ��ȯ�ϴ� �޼ҵ带 �ϼ��ϼ���.
	 * 
	 * ������� str�� "1 2 3 4"��� "1 4"�� �����ϰ�, 
	 * "-1 -2 -3 -4"��� "-4 -1"�� �����ϸ� �˴ϴ�.
	 */
	
	public String getMinMaxString(String str) {
		String[] tmp = str.split(" ");
		int min, max, n;
		min = max = Integer.parseInt(tmp[0]);
		for (int i = 1; i < tmp.length; i++) {
			n = Integer.parseInt(tmp[i]);
			if(min > n) min = n;
			if(max < n) max = n;
        }
        return min + " " + max;
	}
	
	public static void main(String[] args) {
		String str = "1 2 3 4";
		GetMinMaxString_BestAns minMax = new GetMinMaxString_BestAns();
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("�ִ밪�� �ּҰ���?" + minMax.getMinMaxString(str));
	}
	
}// class END
