package LeetCodePrograms;

public class AlphanumericSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sum("12ABC3UI5"));

	}

	public static int sum(String str) {

		String temp = "0";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if (Character.isDigit(ch)) {
				temp = temp + ch;
			} else {
				sum = sum + Integer.parseInt(temp);
				temp = "0";
			}
		}
		return sum = sum + Integer.parseInt(temp);
	}

}
