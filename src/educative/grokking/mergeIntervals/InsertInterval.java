package educative.grokking.mergeIntervals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InsertInterval {
    //Time: O(n); Space: O(n)
    public static List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        if (intervals.size() == 0) return Collections.singletonList(newInterval);
        List<Interval> mergedIntervals = new ArrayList<>();

        int i = 0;

        while (i < intervals.size() && newInterval.start > intervals.get(i).end) {
            mergedIntervals.add(intervals.get(i));
            i++;
        }

        while (i < intervals.size() && newInterval.end > intervals.get(i).start) {
            newInterval.start = Math.min(intervals.get(i).start, newInterval.start);
            newInterval.end = Math.max(intervals.get(i).end, newInterval.end);
            i++;
        }

        mergedIntervals.add(newInterval);

        while (i < intervals.size() ) {
            mergedIntervals.add(intervals.get(i++));
        }

        return mergedIntervals;
    }
}
