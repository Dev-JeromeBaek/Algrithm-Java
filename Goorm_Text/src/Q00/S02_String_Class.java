package Q00;

public class S02_String_Class {
	
	public static void main(String[] args) {
		
		String text = "First String V";
		String concat, upperCase, replace, subString;
		
		System.out.println("�⺻  String : " + text);
		System.out.println("�⺻ String ���� : " + text.length());	// ���ڿ� ���� ���
		
		concat = text.concat(", Second String V");		// ���ڿ� ����
		
		upperCase = concat.toUpperCase();		// ���ڿ� �빮�ڷ� ��ȯ
		
		replace = upperCase.replace('V', 'K');	// ���� V�� K�� ��ȯ
		
		subString = replace.substring(3, 10);	// 3~9 ���ڿ� �߶󳻱�
		
		System.out.println("Concat String : " + concat);
		System.out.println("upperCase String : " + upperCase);
		System.out.println("replace String : " + replace);
		System.out.println("subString String : " + subString);
	}

}
