package Q12_GetMiddle;

public class GetMiddle_JeromeAns {
	
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
		int start, end = 0;
		
		start = word.length()/2;
		if(word.length()%2 == 0) {
			start -= 1;
			end = start+2;
		} else {
			end = start+1;
		}
		return word.substring(start, end);
	}
	
	public static void main(String[] args) {
		GetMiddle_JeromeAns gm = new GetMiddle_JeromeAns();
		System.out.println(gm.getMiddle("power"));
		System.out.println(gm.getMiddle("test"));
	}

}
