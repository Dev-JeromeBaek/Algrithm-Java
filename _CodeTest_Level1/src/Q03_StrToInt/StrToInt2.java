package Q03_StrToInt;

public class StrToInt2 {
	
	/*
	 * Quiz 03 - 스트링을 숫자로 바꾸기 
     * 
     * strToInt 메소드는 String형 str을 매개변수로 받습니다.
     * str을 숫자로 변환한 결과를 반환하도록 strToInt를 완성하세요.
     * 
     * 예를들어 str이 "1234"이면 1234를 반환하고, "-1234"이면 -1234를 반환하면 됩니다.
     * str은 부호(+,-)와 숫자로만 구성되어 있고, 잘못된 값이 입력되는 경우는 없습니다.
	 */
	
	public int getStrToInt(String str) {
		// Integer.parseInt(str) 솔직히 이거 한줄이면 끝난다. 근데 그 logic을 짜보는건,
		// 간단한 것부터 이런마음으로 코딩해야 한다 기억할것. 
		// 시간에 쫓기지 말것.
		char[] charArr = str.toCharArray();
		for (int i=1; i<charArr.length; i++) {
			if(charArr[0] == '-') {
				
			}
		}
		
		return 0;
	}// getStrToInt END
	
	// 아래는 테스트로 출력해 보기 위한 코드입니다.
	
	 public static void main(String[] args) {
		StrToInt2 strToInt = new StrToInt2();
		
		System.out.println(strToInt.getStrToInt("-1234"));
	}// main END
	 
}// class END
