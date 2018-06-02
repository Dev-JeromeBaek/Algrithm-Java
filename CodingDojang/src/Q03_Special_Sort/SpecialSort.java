package Q03_Special_Sort;

import java.util.Scanner;

public class SpecialSort {

	/*
	 * Q 03 - Special Sort (Ư���� ����)
	 * 
	 * n���� ������ ���� �迭�� �ִ�. �� �迭�� ���� ������ ���� ������ ��� ������ �ִ�.
	 * ���� ����� �� �迭�� �� Ư���� ������� �����ؾ� �Ѵ�.
	 * 
	 * ������ �ǰ� �� ��, ���� ������ ���ʿ� ���� ������ ���ʿ� �־�� �Ѵ�.
	 * ���� ���� ������ ���� ������ �������� ������ ����� �Ѵ�.
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
