import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {

	public static void main(String[] args) throws Exception{
	
		String s="08/12/22 14:00";
		
		System.out.println(createDate(s));
		
	}
	
	
	public static Date createDate(String date) throws ParseException{ 
		
		SimpleDateFormat df=new SimpleDateFormat("dd/MM/yy mm:ss");
		return df.parse(date);
		
	}
	
	
	
}
