package example_lambda.exam_case;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Case6 {
	public static void main(String[] args) {
		List<String> username= Arrays.asList("Seongho","Subin","Bomin");
		username.stream()
				.filter(u->u.matches(".*b.*"))
				.collect(Collectors.toList())
				.forEach(n-> System.out.println("name="+n));
	}
}
