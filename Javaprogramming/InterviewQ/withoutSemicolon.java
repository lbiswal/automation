package InterviewQ;

public class withoutSemicolon {

	public static void main(String[] args) {
		if (System.out.printf("Hello world" + "\n") == null) {

		}

		if (System.out.append("Hello world" + "\n") == null) {

		}
		if (System.out.append("Hello world"+ "\n").equals(null)) {

		}
		for(int i=0;i<1;System.out.println("Hello world")) {
			i++;
		}
	}

}
