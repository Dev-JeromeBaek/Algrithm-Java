package Lesson01_Iterations;

public class BinaryGap_JeromeAns {
	
	public int solution(int N) {
		int count = 0;
		int startIndex = 0;
		int lastIndex = 0;
		String[] strArr = Integer.toBinaryString(N).toString().split("");
		System.out.println(Integer.toBinaryString(N).toString());
		System.out.println(strArr.length);
		
		for (int i=strArr.length-1; i>=0; i--) {
			if (strArr[i].equals("1")) {
				lastIndex = i;
				break;
			}
		}
		
		int temp = 0;
		for (int i=0; i<=lastIndex; i++) {
			if(strArr[i].equals("1")) {
				startIndex = i;
				System.out.println("i : " + i);
				System.out.println("startIndex : " + startIndex);
				System.out.println("lastIndex : " + lastIndex);
				System.out.println("temp : " + temp);
				count = count<temp? temp : count;
				temp = 0;
			} else {
				temp++;
			}
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		BinaryGap_JeromeAns test = new BinaryGap_JeromeAns();
		System.out.println(test.solution(2232));
	}

}
