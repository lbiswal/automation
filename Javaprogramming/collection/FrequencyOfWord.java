package collection;

public class FrequencyOfWord {

	public static void main(String[] args) {
    String s = "cutta  ,ck City";
    //s = s.replaceAll(" ","");
    freqofletter(s);
		
		/*String s = "cutta  ,ck City";
	    s = s.replaceAll(" ","");
	    while(s.length() >0) {
	        char ch = s.charAt(0);
	        int count = s.length()-s.replace(""+ch, "").length();
	        
	        System.out.println(ch+" "+"is occuring----"+count);
	        s=s.replace(""+ch, "");
    		
	}*/

}

	public static void freqofletter(String s) {
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
		System.out.println(ch+" "+"is occuring----"+count);
		s=s.replace(""+ch, "");
		}
	}
}
