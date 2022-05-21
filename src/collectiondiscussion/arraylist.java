package collectiondiscussion;

import java.util.ArrayList;

public class arraylist {
	public static void main(String[] args) {
//		ArrayList al =new ArrayList();
//		al.add(50);
//		al.add("abc");
//		al.add(true);
//		
//		System.out.println(al);
//		//we dont use this array
		
		ArrayList<String> al2=new ArrayList<String>();
		
		al2.add("abc");
		al2.add("def");
		
		al2.add("ghi");
		al2.add("xyz");
		
		al2.remove(0);
		al2.set(1, "wxy");
		
		al2.add(1, "tuv");
		al2.add("tuv");
		
		System.out.println(al2);
		
		ArrayList<String>al3=new ArrayList<String>();
		
		al3.add("delhi");
		al3.add("mumbai");
		al3.add("pune");
		al3.add("kolkatta");
		
		al3.addAll(al2);//with the help of addAll method addition of content to another arraylist
		
		System.out.println(al3);
		
		//to all the containt of al2 is present inside the al3 or not
		 boolean ispresent = al3.containsAll(al2);
		 
		 System.out.println(ispresent);//true
		 
		 //to remove all the contents of al2 from al3 collection we will use removeAll method
		 
		 al3.removeAll(al2);
		 System.out.println(al3);
		 
	
		
		
		
		
		
		
		
	}
	
	

}
