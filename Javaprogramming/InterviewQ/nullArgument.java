package InterviewQ;

public class nullArgument {
	
	public static void test(String s,Object o) {
		System.out.println("Object argument");
	}
	public static void test(String o,String s) {
		System.out.println("String argument");
	}
	public static void main(String[] args) {
		test(null,null);
	}

}
