package educative.grokking.mergeIntervals;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

// https://www.educative.io/courses/grokking-the-coding-interview/3jyVPKRA8yx

public class MergeIntervals {
    //Time: O(n * log(n)); Space: O(n)
    public static List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() < 2) return intervals;

        intervals.sort((a, b) -> Integer.compare(a.start, b.start));

        List<Interval> mergedIntervals = new LinkedList<>();
        Iterator<Interval> itr = intervals.iterator();
        Interval interval = itr.next();
        int start = interval.start;
        int end = interval.end;

        while (itr.hasNext()) {
            interval = itr.next();
            if (interval.start <= end) {
                end = Math.max(end, interval.end);
                continue;
            }

            mergedIntervals.add(new Interval(start, end));
            start = interval.start;
            end = interval.end;
        }

        mergedIntervals.add(new Interval(start, end));

        return mergedIntervals;
    }
}

class Interval {
    int start;
    int end;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Interval)) return false;
        Interval interval = (Interval) o;
        return start == interval.start &&
                end == interval.end;
    }

    @Override
    public int hashCode() {
        return Objects.hash(start, end);
    }

    public Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}