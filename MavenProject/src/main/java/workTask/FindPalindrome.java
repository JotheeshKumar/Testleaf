package workTask;

public class FindPalindrome {
	public boolean isPalindrome;

	void palindrome(char[] converted, String check) {
		int len = converted.length;
		boolean isPalindrome = true;
		for (int i = 0; i < len / 2; i++) {
			if (check.charAt(i) == check.charAt(len - i - 1))
				continue;
			else {
				isPalindrome = false;
				break;
			}
		}
		if (isPalindrome) {
			System.out.println("The string " + check + " is a palindrome.");
		} else {
			System.out.println("The string " + check + " is not a palindrome.");
		}
	}

	public static void main(String[] args) {
		String Check = "madam";
		char[] converted = Check.toCharArray();
		FindPalindrome FI = new FindPalindrome();
		FI.palindrome(converted, Check);
	}
}

