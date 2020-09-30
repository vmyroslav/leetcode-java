package educative.grokking.mergeIntervals;

import java.util.ArrayList;
import java.util.List;

// https://www.educative.io/courses/grokking-the-coding-interview/JExVVqRAN9D

public class IntervalsIntersection {
    //Time: O(N+M); Space:O(1)
    public static Interval[] merge(Interval[] arr1, Interval[] arr2) {
        List<Interval> intervalsIntersection = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (
                    (arr1[i].start >= arr2[j].start && arr1[i].start <= arr2[j].end) ||
                    ((arr2[j].start >= arr1[i].start && arr2[j].start <= arr1[i].end))
            ) {
                intervalsIntersection.add(
                        new Interval(Math.max(arr1[i].start, arr2[j].start), Math.min(arr1[i].end, arr2[j].end))
                );
            }

            if (arr1[i].end < arr2[i].end) {
                i++;
            } else {
                j++;
            }
        }

        return intervalsIntersection.toArray(new Interval[0]);
    }
}
