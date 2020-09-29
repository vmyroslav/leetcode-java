package educative.grokking.mergeIntervals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class MergeIntervalsTest {

    @Test
    void merge() {
        List<Interval> input = new ArrayList<Interval>();
        input.add(new Interval(1, 4));
        input.add(new Interval(2, 5));
        input.add(new Interval(7, 9));

        List<Interval> output = new ArrayList<Interval>();
        output.add(new Interval(1, 5));
        output.add(new Interval(7, 9));

        List<Interval> output2 = MergeIntervals.merge(input);
        assertIterableEquals(output, MergeIntervals.merge(input));
    }
}