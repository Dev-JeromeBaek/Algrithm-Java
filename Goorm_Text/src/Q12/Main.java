package Q12;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String value = scan.nextLine();
		String[] strArr = new String[value.length()];
		for (int i=0; i<strArr.length; i++) {
			strArr[i] = value.substring(i);
		}
		
		Arrays.sort(strArr);
		for(String each : strArr) {
			System.out.println(each);
		}
	}
	
}
