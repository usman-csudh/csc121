import java.util.Set;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;


public class SetTest1 {

	public static void main(String[] args) {
		
		Set<String> fruits=new TreeSet<String>();
		
		fruits.add("Apples");
		fruits.add("Bananas");
		fruits.add("Pineapples");
		fruits.add("Oranges");
		
		fruits.add("Apples");
		
		for(String fruit:fruits) {
			System.out.println(fruit);
			
		}
		

		
//		
//		String input="AAB CD 123 213";
//		
//		char[] characters=input.toCharArray(); 
//	
//	    Set<Character> mySet= new HashSet<Character>();
//		
//		for(Character c: characters) {			
//			mySet.add(c);
//		}
//		
//		System.out.println(mySet);

	}

}
