package Q08;

import java.util.Scanner;

public class Main {

	/*
	 * 등차 / 등비 수열
	 * 
	 * [실습내용]
	 * 등차 수열은 연속하는 두항의 차이가 모두 일정한 수열을 뜻하고, 
	 * 등비 수열은 연속하는 두항이 일정한 비를 가지는 수열입니다.
	 * 
	 * 입력으로 4개의 숫자를 등차 또는 등비 수열이 되도록 입력하고
	 * 5번째에 나타날 숫자를 출력하는 것이 문제입니다.
	 * 
	 * [입력]
	 * 등차 또는 등비 수열인 4개의 수 (공백으로 구분)
	 * 
	 * [출력]
	 * 입력된 등차 또는 등비 수열에서 5번쨰에 나타날 숫자
	 * 
	 */
	public static void main(String[] args) {
		  
		// 숫자를 저장할 배열
		int sequence[] = new int[5];
		Scanner sc = new Scanner(System.in);
		  
		// 공백(space bar)을 기준으로 각 숫자 입력
		for(int i=0; i<sequence.length; i++)
			sequence[i] = sc.nextInt();
		asdasd
		  /*
		// 등차수열과 계차수열을 판단할 논리형 변수
		boolean arithmetic = true;
		boolean geometric = true;
		  
		// 계차수열의 패턴을 저장할 배열
		int sequenceTemp[] = new int[4];

		// 각각의 패턴 저장
		for(int i=0; i<sequenceTemp.length; i++)
		{
			sequenceTemp[i] = sequence[i]-sequence[i+1];
		}
		  
		// 계차수열을 판단할 논리형 변수
		boolean difference = true;
		  
		// 배열을 처음부터 끝까지 반복(등차수열 확인)
		for(int i=0; i<sequence.length-2; i++)
		{
			// 등차수열임이 성립하면 논리변수에 true, 하나라도 성립하지 않으면 false 후, break 
			if(sequence[i]-sequence[i+1] == sequence[i+1]-sequence[i+2])
				arithmetic = true;
			else
			{
				arithmetic = false;
				break;
			}
		}

		// 배열을 처음부터 끝까지 반복(등비수열 확인)
		for(int i=0; i<sequence.length-2; i++)
		{
			// 등비수열임이 성립하면 논리변수에 true, 하나라도 성립하지 않으면 false 후, break   
			if(sequence[i+1]/sequence[i] == sequence[i+2]/sequence[i+1])
				geometric = true;
			else
			{
				geometric = false;
				break;
			}
		}
		  
		// 계차 수열의 패턴이 들어있는 배열을 처음부터 끝까지 반복
		for(int i=0; i<sequenceTemp.length-2; i++)
		{
			// 계차수열임이 성립하면 논리변수에 true, 하나라도 성립하지 않으면 false 후, break 
			if(sequenceTemp[i]-sequenceTemp[i+1] == sequenceTemp[i+1]-sequenceTemp[i+2])
				difference = true;
			else
			{
				difference = false;
				break;
			}
		}
		  
		// 다음 수와 함께 출력
		if(arithmetic)
			System.out.println("다음 수 : "+(sequence[4]-(sequence[0]-sequence[1]))+", 등차추열");
		if(geometric)
			System.out.println("다음 수 : "+(sequence[4]*(sequence[0]/sequence[1]))+", 등비수열");
		if(difference)
			System.out.println("다음 수 : "+(sequence[4]-(sequenceTemp[3]-(sequenceTemp[0]-sequenceTemp[1])))+", 계차수열");
		if(arithmetic=geometric=difference=false)
			System.out.println("등차, 등비, 계차 수열 아님");
			*/
	}
}
