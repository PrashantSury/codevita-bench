package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 15 — Binary search on a sorted array
 * Week 3. Budget about 170 minutes.
 *
 * Write lower and upper bound correctly, and test the empty and single-element cases.
 *
 * Why this is in the plan: The search itself is rarely the whole problem. It is the tool inside a
 * larger one. The off-by-one is the bug.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Implement the first index with value ≥ target, and the first index with value >
 * target. Use a half-open range if that is how you avoid the infinite loop. Test an empty array, a
 * missing target, and duplicates.
 *
 * [required] Run one mental trace where mid is computed and the range shrinks on every step. If
 * the range does not shrink, the loop is wrong.
 *
 * [required] Classic binary search. Return the index or −1.
 *
 * [required] Search insert position. This is lower bound.
 *
 * [required] Find the first and last position of a target in a sorted array with duplicates.
 *
 * [stretch] Search in a rotated sorted array only after the three above are boring.
 *
 * You are done when: Both bounds pass empty, singleton, all-equal, and missing-target tests.
 *
 * Pitfalls:
 * - mid = (lo + hi) / 2 can overflow in 32-bit. Use lo + (hi − lo) / 2.
 * - Updating lo = mid instead of lo = mid + 1 when the check is false is the infinite loop.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day15
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day15 {
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
