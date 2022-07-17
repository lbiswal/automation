package InterviewQ.Array;


import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CountWordInSent {

	public static void main(String[] args) {
		
		String s = "i am am  lipika";
		String [] arr = s.split(" +");
		Map<String,Integer> mp=new HashMap<>();
		/*for(String word:arr) {
			mp.put(word, mp.getOrDefault(word, 0)+1);
		}*/
		
		for(int i=0;i<arr.length;i++) {
			if(mp.containsKey(arr[i])) {
				mp.put(arr[i],mp.get(arr[i])+1);
			}
			else {
				mp.put(arr[i], 1);
			}
		}
		  for(Map.Entry<String,Integer> entry:
              mp.entrySet())
  {
      System.out.println(entry.getKey()+
              " - "+entry.getValue());
  }
		
		
		
	}

}
