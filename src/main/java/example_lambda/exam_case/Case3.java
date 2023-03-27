package example_lambda.exam_case;

import example_lambda.func.Code3;

public class Case3 {
	public static void main(String[] args) {
		Code3 cd;
		String name="이성호";

		cd=()->name;
		System.out.println(cd.code());

		String language="Java";
		cd=()-> {return language;};
		System.out.println(cd.code());
	}
}
