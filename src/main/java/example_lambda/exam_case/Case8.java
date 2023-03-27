package example_lambda.exam_case;

import java.util.Optional;

public class Case8 {
	public static void main(String[] args) {
		Optional<String> greeting = Optional.of("Hello world");
		greeting.ifPresentOrElse(
				str-> System.out.println(str),
				()-> System.out.println("null")
		);

		Optional<Object> test = Optional.empty();
		test.ifPresentOrElse(
				str-> System.out.println(str),
				()-> System.out.println("null")
		);
	}
}
