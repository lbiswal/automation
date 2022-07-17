package InterviewQ.Array;

import collection.FrequencyOfWord;

public class RemoveDupliateChar {
	

	
	public static void main(String[] args) {
		String s="Abbbb  Hahssj";
		RemoveDupliateChar rdc=new RemoveDupliateChar();
//		FrequencyOfWord fow=new FrequencyOfWord();
//		fow.freqofletter(s);
		FrequencyOfWord.freqofletter(s);
	
		String str="aabhhbsGjji";
		System.out.println("Before remove dublicate--"+str);
		String s1=rdc.removeChr(str);
		System.out.println("After remove dublicate ----"+s1);
		}
	public  String removeChr(String str){
		
		str = str.replaceAll("[^a-zA-Z0-9]","");
		str = str.toLowerCase();
		String newStr ="";
		for(int i=0;i<str.length();i++) {
			char ch =str.charAt(i);
			if(newStr.indexOf(ch) == -1) {
				newStr = newStr+ch;
			}
		}
		return newStr;
		
		
	}
	
	

}
