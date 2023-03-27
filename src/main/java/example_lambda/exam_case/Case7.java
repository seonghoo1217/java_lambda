package example_lambda.exam_case;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case7 {
	public static void main(String[] args) {
		List<String> abc= Arrays.asList("a","b","c","b");

		abc.stream()
				.distinct()
				.collect(Collectors.toList())
				.forEach(word-> System.out.println(word));
	}
}
