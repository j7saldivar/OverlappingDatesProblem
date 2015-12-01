import java.text.ParseException;
/************
 * 
 * sample
 * Jan 2015 - June 2015
 * Feb 2015 - July 2015
 * Mar 2015 - June 2015
 * Mar 2014 - June 2014
 * 
 * expected
 * Jan 2015 - July 2015
 * Mar 2014 - June 2014
 * 
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		ArrayList<Interval> list = new ArrayList<Interval>();

		Interval i1 = new Interval(
				new SimpleDateFormat("MM/yyyy").parse("01/2015"),
				new SimpleDateFormat("MM/yyyy").parse("06/2015"));

		Interval i2 = new Interval(
				new SimpleDateFormat("MM/yyyy").parse("02/2015"),
				new SimpleDateFormat("MM/yyyy").parse("07/2015"));

		Interval i3 = new Interval(
				new SimpleDateFormat("MM/yyyy").parse("03/2015"),
				new SimpleDateFormat("MM/yyyy").parse("06/2015"));
		
		Interval i4 = new Interval(
				new SimpleDateFormat("MM/yyyy").parse("03/2014"),
				new SimpleDateFormat("MM/yyyy").parse("06/2014"));

		list.add(i1);
		list.add(i2);
		list.add(i3);
		list.add(i4);

		System.out.println(list);

		list = Merge.merge(list);

		System.out.println(list);

	}

}
