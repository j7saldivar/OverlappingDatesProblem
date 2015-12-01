/*
 * Date Intervals
 */

import java.util.Date;

class Interval {
	Date start;
	Date end;

	Interval(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	@Override
	public String toString() {
		return "Interval [start=" + start + ", end=" + end + "]";
	}
	
}