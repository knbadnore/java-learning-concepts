package Java8;

import java.util.regex.Pattern;

public class SumOfAlphanumeric {

	public static void main(String[] args) {
		System.out.println(findSum("10AVDJ762A1M0%"));

	}
	public static int findSum(String str) {
		return Pattern.compile("\\d+")
				.matcher(str)
				.results()
				.mapToInt(match->Integer.parseInt(match.group()))
				.sum();
			
	}

}
