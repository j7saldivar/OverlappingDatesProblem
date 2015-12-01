/************
 * 
 * sample max date
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SampleMaxDate {
	
	public static void main(String[] args) throws ParseException {
		
		Date d1 = new SimpleDateFormat("MM/yyyy").parse("01/2015");
		Date d2 = new SimpleDateFormat("MM/yyyy").parse("09/2015");

		Date maxDate = (Date) MaxDate.max(d1, d2);
		System.out.println("MAX date :" + maxDate);
	}
}