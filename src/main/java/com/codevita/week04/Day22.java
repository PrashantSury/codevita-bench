package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 22 — Recursion and subsets
 * Week 4. Budget about 180 minutes.
 *
 * Generate subsets and permutations with an explicit base case, and know when 2^n is legal.
 *
 * Why this is in the plan: Small n in a story is permission to enumerate. You must notice n ≤ 20.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Subsets by take-or-skip recursion. Draw the tree for {1,2,3}. Count the leaves: 8.
 *
 * [required] Write the cutoff again: 2^20 is about a million simple operations. 2^25 starts to
 * hurt. n! for n ≥ 12 is usually too big unless you prune.
 *
 * [required] Subsets. Also the iterative bit-mask version for n ≤ 20. They must return the same
 * count.
 *
 * [required] Permutations of a small array. Then a variant: permutations of a string that may
 * contain duplicates, with duplicates skipped.
 *
 * [required] One original: given n ≤ 20 numbers, count subsets whose sum equals S. Recursion or
 * bits. Test empty subset and sum 0.
 *
 * [stretch] Letter combinations of a phone number.
 *
 * You are done when: Subset count for {1,2,3} is 8 in both the recursive and the mask versions.
 *
 * Pitfalls:
 * - Forgetting to un-choose after the recursive call mutates the shared array.
 * - Starting a 2^n recursion without reading n.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day22
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day22 {
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
