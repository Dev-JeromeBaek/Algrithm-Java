
public class Q2 {
	
	public int solution(String A, String B) {
        // write your code in Java SE 8
		// A > K > Q > J > T > 2-9
		int alecWin = 0;
		String[] alec = A.split("");
		String[] bob = B.split("");
		for (int i=0; i<A.length(); i++) {
			if(check(alec[i]) > check(bob[i])) {
				alecWin++;
			}
		}
		return alecWin;
    }
	
	public int check(String card) {
		int result = 0;
		if(card.equals("A")) {
			result = 14;
		} else if(card.equals("K")) {
			result = 13;
		} else if(card.equals("Q")) {
			result = 12;
		} else if(card.equals("J")) {
			result = 11;
		} else if(card.equals("T")) {
			result = 10;
		} else {
			result = Integer.parseInt(card);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Q2 q = new Q2();
		String a = "A586QK";
		String b = "JJ654K";
		System.out.println(q.solution(a, b));
	}// main END
}// class END
