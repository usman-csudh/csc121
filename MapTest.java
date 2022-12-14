import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeMap;


public class MapTest {

	public static void main(String[] args) {
		
		String input="AAB CD DDDDDDDDDDDDDD CCCCCCCCCCCCC 123 213";
		char[] characters=input.toCharArray(); 
		Map<Character, Integer> myMap=new TreeMap<Character,Integer>();

		for(Character c: characters) {	
			Integer count=myMap.get(c);
		
			if(count!=null) {
				myMap.put(c, count+1);
				
			}
			else {
				myMap.put(c, 1);

			}
		}
		
		System.out.println(myMap);
		
//	    Set<Character> mySet= new HashSet<Character>();
//		
//		
//		
//		myMap.put('A', 1);
//		myMap.put('B', 3);
//		
//		
//		
//		System.out.println(myMap.put('A',myMap.get('A')+1));
//		
//		System.out.println(myMap);

	}

}
