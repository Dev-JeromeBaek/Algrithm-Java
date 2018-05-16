package Q01_ReverseInt;

public class ReverseInt_JeromeAns2 {
	
	/*
	 * Q 01 - ���� ������������ ��ġ�ϱ�
	 * 
	 * reverseInt �޼ҵ�� int�� n�� �Ű������� �Է¹޽��ϴ�.
	 * n�� ��Ÿ���� ���ڸ� ū�ͺ��� ���� ������ ������ ���ο� ������ �������ּ���.
	 * 
	 * ������� n�� 118372�� 873211�� �����ϸ� �˴ϴ�.
	 * n�� ���� �����Դϴ�.
	 * 
	 */
	
	public int reverseInt(int n) {
		char[] numbers = Integer.toString(n).toCharArray();
	    String strSort = "";

	    if(n <= 0) return 0;

	    for(int i = 0; i < numbers.length; i++) {
	      for(int j = 0; j < i; j++) {
	        if(numbers[i] - 48 > numbers[j] - 48) {
	          char temp = numbers[i];
	          numbers[i] = numbers[j];
	          numbers[j] = temp;
	        }
	      }
	    }
	    strSort = new String(numbers);
		return Integer.parseInt(strSort);
	}
	
	// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}

}