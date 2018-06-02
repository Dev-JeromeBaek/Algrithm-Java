package Q01_Multiples_of_3_and_5;

import java.util.Scanner;

public class Multiples_of_3_and_5 {
	
	int multiples(int num1, int num2) {
		int result = 0;
        for (int i=1 ; i<1000 ; i++) {
            if( i%num1==0 || i%num2==0 ) result+=i;
        }
		
		return result;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("두 수 입력 (ex : 3 5)");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		Multiples_of_3_and_5 test = new Multiples_of_3_and_5();
		System.out.println(test.multiples(num1, num2));
	}

}
