package dataUtil;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ConversaoData {

	public Date converterStringDate(String data) {
		
		String dt[] = data.split("/");  // dt[0] = 28 | dt[1] = 04 | dt[2] = 2018
		
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Integer.parseInt(dt[2]),
					 Integer.parseInt(dt[1])-1, // -1 pq o 0 é Janeiro
					 Integer.parseInt(dt[0]));
		
		return calendar.getTime();
	}
	
	public Date converterStringDateBanco(String data) {
		
		String dt[] = data.split("-");  
		
		Calendar calendar = new GregorianCalendar();
		
		calendar.set(Integer.parseInt(dt[2]),  
					 Integer.parseInt(dt[1]),  
					 Integer.parseInt(dt[0])); 
		

		return calendar.getTime();
	}
	
	public String coverterDateMysql(Date data) {
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		return df.format(data);
	}
}
