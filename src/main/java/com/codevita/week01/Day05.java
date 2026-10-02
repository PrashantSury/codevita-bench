package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 5 — Sorting and a custom order
 * Week 1. Budget about 180 minutes.
 *
 * Sort by the rule in the story, including ties, and know the cost.
 *
 * Why this is in the plan: A common CodeVita shape is 'reorder these items by a strange effort or
 * weight'. If you can state the key, the problem is sorting.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Write a comparator with two keys: primary rule, then a tie break the statement
 * actually asks for. If it does not mention ties, keep the original order or the smaller index and
 * say so in a comment.
 *
 * [required] State that comparison sort is O(n log n). Counting sort is only for small integer
 * keys.
 *
 * [required] Merge intervals. Sort by start, then scan once.
 *
 * [required] Sort a list of words by length, then alphabetically. Build two tests where the tie
 * break changes the answer.
 *
 * [required] Invent this and solve it: each swap of two adjacent items costs the product of their
 * weights. You only need the final order the problem asks for, not a simulation of every swap,
 * unless the statement demands the cost of a specific procedure. Read twice before coding.
 *
 * [stretch] Sort colors, Dutch national flag, one pass, constant extra memory.
 *
 * You are done when: A custom sort with an explicit tie break compiles and matches a hand-built
 * example.
 *
 * Pitfalls:
 * - Unstable sort plus a missing tie break makes samples pass and hidden tests fail.
 * - Sorting a million strings is fine. Sorting them with a quadratic comparator is not.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day05
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day05 {
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
