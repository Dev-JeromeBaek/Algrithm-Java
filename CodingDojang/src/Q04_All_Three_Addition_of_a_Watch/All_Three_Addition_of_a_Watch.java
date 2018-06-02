package Q04_All_Three_Addition_of_a_Watch;

public class All_Three_Addition_of_a_Watch {

	/*
	 * Q 04 - 3�� ��Ÿ���� �ð��� ���� ���ϸ�?
	 * 
	 * ������ �ð迡 �Ϸ絿��(00:00 ~ 23:59) 
	 * 3�� ǥ�õǴ� �ð��� �ʷ� ȯ���ϸ� �� �� ��(second) �ϱ��?
	 * ������ �ð�� �Ϸ絿�� ������ ���� ��:��(00:00 ~ 23:59)���� ǥ�õ˴ϴ�.
	 * 
	 * 00:00 (60�ʰ� ǥ�õ�)
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
