package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 19 — Sort, then scan
 * Week 3. Budget about 170 minutes.
 *
 * Recognize problems that become one linear pass after the right sort.
 *
 * Why this is in the plan: This is the most common 'it looked like a simulation' rescue in Round
 * 1.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Write three examples of sort-then-scan: merge intervals, meeting rooms by start time,
 * and two pointers on a sorted array.
 *
 * [required] The question to ask: does order in the input matter, or only order by some key? If
 * only the key matters, you may sort.
 *
 * [required] Meeting rooms II, or minimum platforms: sort starts and ends separately and sweep.
 *
 * [required] Merge intervals again, from a blank file, in under 20 minutes.
 *
 * [required] A CodeVita-style original: several events with a start, an end, and a weight. Report
 * the maximum number of non-overlapping events. This is day 17's greedy. If the ask had been
 * maximum total weight, stop and label it DP, do not force greedy.
 *
 * [stretch] One problem from the CodeChef set that you first misread as simulation and then
 * sorted.
 *
 * You are done when: For a new statement you can say whether sorting is legal, and by which key.
 *
 * Pitfalls:
 * - Sorting destroys the original index. If the output needs original positions, store the index
 * in the item.
 * - Maximum weight of non-overlapping intervals is not the earliest-finish greedy.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day19
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day19 {
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner(System.in);
        // Read the input shape from the statement. Do not assume a leading T.
        solve(in);
    }

    static void solve(FastScanner in) throws IOException {
        // Replace this with today's drill.
        long answer = 0L;
        System.out.println(answer);
    }
}
