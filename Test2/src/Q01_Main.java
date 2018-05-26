import java.util.Scanner;

public class Q01_Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String result = "";
		for (int i=1; i<=n/2; i++) {
			if(n%i == 0) result += i+" ";
		}
		result += n+" ";
		
		System.out.println(result);
	}
}
