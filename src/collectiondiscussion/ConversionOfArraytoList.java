package collectiondiscussion;

import java.util.ArrayList;
import java.util.Arrays;

public class ConversionOfArraytoList {
	
	public static void main(String[] args) {
		
		//array to array list convesion
		
		String s[]= {"aaa","bbb","ccc"};

		ArrayList<String>al=new ArrayList<String>(Arrays.asList(s));
		
		System.out.println(al);
		
		//array list to array conversion
		
		ArrayList<Integer>al2=new ArrayList<Integer>();
		
		al2.add(10);
		al2.add(20);
		al2.add(30);
		al2.add(40);
		
		int length = al2.size();
		
		Integer[]i=new Integer [length] ;
		
		al2.toArray(i);//to conversion of array list to array
		
		for(int ii:i)
		{
			System.out.println(ii);
		}
		
		
		
		
		
		
	}

}
