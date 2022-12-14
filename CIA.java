import java.io.File;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class CIA {

	public static void main(String[] args) throws Exception{
		
		File ciaFile=new File("/Users/usman/cia.txt");	
		Map<Integer, String> countries= new TreeMap<Integer, String>();
		
		
		Scanner s=new Scanner(ciaFile);
				
		while(s.hasNextLine()) {
			String line=s.nextLine();
			String[] tokens=line.split(",");
			
			String country=tokens[0];
			int population=Integer.parseInt(tokens[1]);
			
			countries.put(population,country);
			
				
		}
		
		Set keys=countries.keySet();
		System.out.println(keys);
		int size=keys.size();
		System.out.println(size);

		
	}

}
