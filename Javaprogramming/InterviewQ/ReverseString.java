package InterviewQ;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReverseString {

	public static void main(String[] args) {
		String s="test12pop90java989pyt";
		String[] parts = s.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
		StringBuilder sb = new StringBuilder();
		for (String part : parts) {
		    if (!part.matches("\\d+")) {
		        StringBuilder num = new StringBuilder(part);
		        sb.append(num.reverse());
		    }
		    else {
		        sb.append(part);
		    }
		}

		System.out.println(sb.toString());
		
	}

}
