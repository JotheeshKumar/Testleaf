package workTask;

import java.util.Arrays;

public class Anagram {
	void check(String text1, String text2) {
		int Tcount = 0;
		int n1 = text1.length();
		int n2 = text2.length();
		if (n1 == n2) {
			char[] t1Array = text1.toCharArray();
			char[] t2Array = text2.toCharArray();
			Arrays.sort(t2Array);
			Arrays.sort(t1Array);
			for (int i = 0; i <= n1 - 1; i++) {
				if ((t1Array[i] != t2Array[i])) {
					System.out.println("It is not a anagarm");
					break;
				} else {
					Tcount++;
				}
				if (Tcount == (n1)) {
					System.out.println("It's a anagarm");
				}
			}
		} else {
			System.out.println("Its not a anagarm");
		}
	}

	public static void main(String[] args) {
		String text1 = "potdss";
		String text2 = "potdss";
		Anagram ag = new Anagram();
		ag.check(text1, text2);
	}
}
