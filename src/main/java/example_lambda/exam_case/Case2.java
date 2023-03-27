package example_lambda.exam_case;

import example_lambda.func.Code2;

public class Case2 {
	public static void main(String[] args) {
		Code2 code2;

		code2=(a)-> System.out.println(a+" 학생");
		code2.userHi("이성호");
	}
}
