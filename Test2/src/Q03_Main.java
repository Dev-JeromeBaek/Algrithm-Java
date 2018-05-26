import java.util.Scanner;

public class Q03_Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n= scanner.nextInt();
		
		if(n%4==0 && n%100 != 0 || n%400 == 0) {
			System.out.print("Leap Year");
		} else {
			System.out.print("Not Leap Year");
		}
	}

}
