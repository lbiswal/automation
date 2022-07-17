package collection;

public class PrintDuplicateWord {

	public static void main(String[] args) {
		//String s="aaabbbbcfffeee";
		printdupicate("aaabbbbcfffeee");
		}
	public static void printdupicate(String s) {
		s= s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);
		s=s.toLowerCase();
		while(s.length() >0) {
		char ch = s.charAt(0);
		int count=0;
		String str = s;
		while(str.indexOf(ch) !=-1) {
			count++;
			str = str.substring(str.indexOf(ch)+1);
		}
		if(count >=2) {
		System.out.println(ch+" "+"is occuring----"+count);
		}
		s=s.replace(""+ch, "");
		}
	}
}
	
	
	


