package workTask;

public class RemoveDuplicates {
	void duplicate(String text) {
		String[] split = text.split(" ");
		int count = split.length;
		int cnt = 0;
		for (int i = 0; i < count; i++) {
			for (int j = i + 1; j < count; j++) {
				if (split[i].equalsIgnoreCase(split[j])) {
					cnt += 1;
				}
			}
			if (cnt >= 1) {
				split[i] = "";
			}
			cnt = 0;
		}
		System.out.println("without duplicates: ");
		for (String string : split) {
			System.out.print(string + " ");
		}
	}

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		System.out.println("with duplicates: "+text);
		RemoveDuplicates rd = new RemoveDuplicates();
		rd.duplicate(text);
	}
}
