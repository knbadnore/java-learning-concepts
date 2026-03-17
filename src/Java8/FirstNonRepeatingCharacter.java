package Java8;

import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FirstNonRepeatingCharacter {
	public static void main(String[] args) {

		System.out.println(firstNonRepeatCharacter("JAVA").orElse(null));
		System.out.println(firstNonRepeatCharacter("JAJA").orElse(null));

	}

	public static Optional<Character> firstNonRepeatCharacter(String str) {

		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(k -> k, Collectors.counting()));

		return str.chars().mapToObj(c -> (char) c).filter(c -> map.get(c) == 1).findFirst();
	}

}
