package Q01_ReverseInt;

public class ReverseInt_JeromeAns2 {
	
	/*
	 * Q 01 - 정수 내림차순으로 배치하기
	 * 
	 * reverseInt 메소드는 int형 n을 매개변수로 입력받습니다.
	 * n에 나타나는 숫자를 큰것부터 작은 순으로 정렬한 새로운 정수를 리턴해주세요.
	 * 
	 * 예를들어 n이 118372면 873211을 리턴하면 됩니다.
	 * n은 양의 정수입니다.
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
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	public static void main(String[] args) {
		ReverseInt ri = new ReverseInt();
		System.out.println(ri.reverseInt(118372));
	}

}
