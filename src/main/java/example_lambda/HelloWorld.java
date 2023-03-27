package example_lambda;


public class HelloWorld {
	public static void main(String[] args) {
		System.out.println(hello());
		Runnable helloword = () -> System.out.println("Hello world");
		helloword.run();
	}

	public static String hello(){
		return "Hello world";
	}

}
