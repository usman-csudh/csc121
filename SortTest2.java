import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;


public class SortTest2 {

	public static void main(String[] args) {
		
		//Primitive types cannot be used with Sets
		Set<String> mySet= new TreeSet<String>();
		
		mySet.add("10");
		mySet.add("7");
		mySet.add("1");
		mySet.add("100");
		mySet.add("9");

		
		System.out.println(mySet.size());
		System.out.println(mySet);
		
		System.out.println(mySet.contains("179"));

		System.out.println();
		
		for(String i: mySet) {
			System.out.println(i);
			
		}
		
		

	}

}
