package collectiondiscussion;

import java.util.TreeSet;

public class TreeSetDiscussion {
	
	public static void main(String[] args) {
	//Example1:	
		TreeSet<String>ts=new TreeSet<String>();
		
		ts.add("Delhi");
		ts.add("kolkatta");
		ts.add("mumbai");
		ts.add("pune");
		ts.add("bengluru");
		ts.add("pune");
		
		System.out.println(ts);
		
		//Example2:
		
		TreeSet<Integer>ts1=new TreeSet<Integer>();
		
		ts1.add(56);
		ts1.add(0);
		ts1.add(90);
		ts1.add(78);
	
		System.out.println(ts1);
		
	//	TreeSet:-it is class which by default store the value in certain acending order
		//null value not alowed in tree set
		
		
	}

}
