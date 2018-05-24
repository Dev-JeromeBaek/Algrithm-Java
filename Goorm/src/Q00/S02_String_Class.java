package Q00;

public class S02_String_Class {
	
	public static void main(String[] args) {
		
		String text = "First String V";
		String concat, upperCase, replace, subString;
		
		System.out.println("기본  String : " + text);
		System.out.println("기본 String 길이 : " + text.length());	// 문자열 길이 출력
		
		concat = text.concat(", Second String V");		// 문자열 연결
		
		upperCase = concat.toUpperCase();		// 문자열 대문자로 변환
		
		replace = upperCase.replace('V', 'K');	// 문자 V를 K로 변환
		
		subString = replace.substring(3, 10);	// 3~9 문자열 잘라내기
		
		System.out.println("Concat String : " + concat);
		System.out.println("upperCase String : " + upperCase);
		System.out.println("replace String : " + replace);
		System.out.println("subString String : " + subString);
	}

}
