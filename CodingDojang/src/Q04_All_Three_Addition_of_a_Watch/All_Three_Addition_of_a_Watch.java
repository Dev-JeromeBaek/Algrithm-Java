package Q04_All_Three_Addition_of_a_Watch;

public class All_Three_Addition_of_a_Watch {

	/*
	 * Q 04 - 3이 나타나는 시간을 전부 합하면?
	 * 
	 * 디지털 시계에 하루동안(00:00 ~ 23:59) 
	 * 3이 표시되는 시간을 초로 환산하면 총 몇 초(second) 일까요?
	 * 디지털 시계는 하루동안 다음과 같이 시:분(00:00 ~ 23:59)으로 표시됩니다.
	 * 
	 * 00:00 (60초간 표시됨)
	 * 00:01
	 * 00:02
	 * ...
	 * 23:59
	 * 
	 */
	
	int timmer(int num) {
		int time = 0;
		int hours = 0;
		for (; hours<24; hours++) {
			String showHours = Integer.toString(hours);
			if(showHours.contains("3")) {
				time += 60*60;
			} else {
				int minutes = 0;
				for (; minutes<60; minutes++) {
					String showMinutes = Integer.toString(minutes);
					if(showMinutes.contains("3")) time += 60;
				}
			}
		}
		return time;
	}
	
	public static void main(String[] args) {
		All_Three_Addition_of_a_Watch test = new All_Three_Addition_of_a_Watch();
		System.out.println(test.timmer(3));
	}
	
	
}
