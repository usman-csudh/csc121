import java.io.File;
import java.io.FileInputStream;

public class TestFileBin {

	public static void main(String[] args) throws Exception{
		
		File myFile=new File("/Users/usman/csc121/test.txt");
		//System.out.println(myFile.canRead());
		
		FileInputStream in=new FileInputStream(myFile);	
		System.out.println(in.available());
		
		byte[] bucket=new byte[1000];
		
		in.read(bucket);
		System.out.println(bucket[0]);
		String message=new String(bucket);
		
		System.out.println(message);
		
		
		//Read one byte at a time
		
		//System.out.println((char)in.read());
		//System.out.println(in.read());
		//System.out.println(in.read());
		
		
		
		
		
		
		
	}

}
