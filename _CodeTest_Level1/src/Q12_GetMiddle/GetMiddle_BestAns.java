package Q12_GetMiddle;

public class GetMiddle_BestAns {
	
	/*
	 * Q 12 - 가운데 글자 가져오기
	 * 
	 * getMiddle메소드는 하나의 단어를 입력받습니다.
	 * 단어를 입력 받아서 가운데 글자를 반환하도록
	 * getMiddle메소드를 만들어 보세요.
	 * 단어의 길이가 짝수일경우 가운데 두글자를 반환하면 됩니다.
	 * 
	 * 예를들어 입력받은 단어가 power이라면 w를 반환하면 되고,
	 * 입력받은 단어가 test라면 es를 반환하면 됩니다.
	 * 
	 */
	
	String getMiddle(String word) {
		return word != null ? word.substring((word.length()-1)/2, (word.length()+2)/2) : "";
	}
	
	public static void main(String[] args) {
		GetMiddle_BestAns gm = new GetMiddle_BestAns();
		System.out.println(gm.getMiddle("power"));
		System.out.println(gm.getMiddle("test"));
	}

}
