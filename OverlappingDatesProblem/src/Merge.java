import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;

 
public class Merge {
	public static ArrayList<Interval> merge(ArrayList<Interval> intervals) {
 
		if (intervals == null || intervals.size() <= 1)
			return intervals;

		Collections.sort(intervals, new IntervalComparator());
 
		ArrayList<Interval> result = new ArrayList<Interval>();
 
		Interval prev = intervals.get(0);
		for (int i = 1; i < intervals.size(); i++) {
			Interval curr = intervals.get(i);
 
			if (prev.end.after(curr.start) || prev.end.equals(curr.start)) {
				// merged case
				Interval merged = new Interval(prev.start, (Date) MaxDate.max(prev.end, curr.end));
				prev = merged;
			} else {
				result.add(prev);
				prev = curr;
			}
		}
 
		result.add(prev);
 
		return result;
	}
}
 
class IntervalComparator implements Comparator<Interval> {
	public int compare(Interval i1, Interval i2) {
		return i1.start.compareTo(i2.start);
	}
}