package collectiondiscussion;

import java.util.Collection;
import java.util.HashMap;

public class MapDiscussion {
	
	public static void main(String[] args) {
		
	
	HashMap<Integer, String>hm=new HashMap<Integer,String>();
	
	hm.put(101, "Delhi");
	hm.put(506, "Pune");
	hm.put(404, "mumbai");
	hm.put(900, "Bengluru");
//	hm.put(506, "udgir");//key cannot be duplicate if we try to make key as a duplicate then it will automatically
	                    //overwrite the latest value of it
 //   hm.put(108, "pune");//values can be duplicate in hashmap butkeys not duplicate
	
	System.out.println(hm);
	
	//methods in map
	
	Collection<String> v = hm.values();//to get all values 
	
	System.out.println(v);
	
	String v1 = hm.get(506);
	
	System.out.println(v1);//pune
	
	boolean iskeypresent = hm.containsKey(101);
	
	System.out.println(iskeypresent);//true
	
	boolean valuepresent = hm.containsValue("mumbai");
	
	System.out.println(valuepresent);//true
	
	
	}
}
