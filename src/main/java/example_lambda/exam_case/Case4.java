package example_lambda.exam_case;

import example_lambda.func.Code4;

public class Case4 {
	public static void main(String[] args) {
		Code4 cd;
		String name="이성호";

		cd=u->u+name;
//		System.out.println(cd.userName("학생 "));
		Case5 case5=new Case5();
		case5.getUserName(cd.userName("학생 "));
	}
}
