package collectiondiscussion;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class SetInterface {
	
	public static void main(String[] args) {
		
		HashSet<String>hs=new HashSet<String>();//values are getting stored uniquely
		
		
		hs.add("delhi");
		hs.add("kolkatta");
		hs.add("mumbai");
		hs.add("pune");
		hs.add("bengluru");
		hs.add("pune");
		hs.add(null);
		hs.add(null);
		
		System.out.println(hs);//hash set is not allow duplicate value 
		
	//insertion order inside the hashset is not maintained
	//null value is allowed inside the hashset but only once
		
		
	//linkedHashSet	:data is save as per the insertion order
		//and also uniqness is maintained
		
		LinkedHashSet<String> lhs=new LinkedHashSet<String>();
		
		lhs.add("delhi");
		lhs.add("kolkata");
		lhs.add("mumbai");
		lhs.add("pune");
		lhs.add("bengluru");
		lhs.add("pune");
		lhs.add(null);
		lhs.add(null);
		
		System.out.println(lhs);
		
		
		
		
	}

}
