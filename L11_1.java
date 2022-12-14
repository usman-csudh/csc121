import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;


public class L11_1 {

	public static void main(String[] args) {
		
		String s="AB CDDD FFF12 3231";
		char[] chars=s.toCharArray();
		
		
		
		//Primitive types cannot be used with Sets
		Set<Character> mySet= new TreeSet<Character>();
		
		for(Character c: chars) {
			mySet.add(c);
		}
		
	  	mySet.remove(' ');
		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		char[] output=new char[mySet.size()];
				
		int x=0;
     	for(Character c: mySet) {
     		output[x++]=c;
     		
		}
		
     	System.out.println(mySet.contains(' '));
     	
   	String sout=new String(output);
		System.out.println(sout);
	}

}
