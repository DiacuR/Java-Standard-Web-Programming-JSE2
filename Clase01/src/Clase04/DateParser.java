package Clase04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateParser {

	public static void main(String[] args) {
		String fecha = "10/10/2019";
		
		Date fechaDate = DateParser.parseDate(fecha); 
		
		System.out.println(fechaDate);
	}
	
	public final static Date parseDate(String dateStr) {
		
		Date fecha;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			fecha = sdf.parse(dateStr);
			
		} catch (ParseException e) {
			e.printStackTrace();
			fecha = null;
		}
		
		return fecha;
	}
}
