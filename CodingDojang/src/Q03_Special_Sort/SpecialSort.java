package Q03_Special_Sort;

import java.util.Scanner;

public class SpecialSort {

	/*
	 * Q 03 - Special Sort (특별한 정렬)
	 * 
	 * n개의 정수를 가진 배열이 있다. 이 배열은 양의 정수와 음의 정수를 모두 가지고 있다.
	 * 이제 당신은 이 배열을 좀 특별한 방법으로 정렬해야 한다.
	 * 
	 * 정렬이 되고 난 후, 음의 정수는 앞쪽에 양의 정수는 뒷쪽에 있어야 한다.
	 * 또한 양의 정수와 음의 정수의 순서에는 변함이 없어야 한다.
	 * 
	 */
	
	String spcSort(int[] array) {
		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<((array.length-1)-i); j++) {
				if(array[j] > 0 && array[j+1] < 0) {
					 int temp = array[j];
					 array[j] = array[j+1];
					 array[j+1] = temp;
				}
			}
		}
		String result = "";
		for(int each : array) {
			result += each+" ";
		}
		return result.trim();
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] array = {-1, 1, 3, -2, 2};
		SpecialSort test = new SpecialSort();
		System.out.println(test.spcSort(array));
	}
}
