package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 2 — Constraints before code
 * Week 1. Budget about 180 minutes.
 *
 * Decide the legal complexity from the limits before you choose an algorithm.
 *
 * Why this is in the plan: Many statements look like they need a clever algorithm and then give
 * you n ≤ 100. Others look easy and hide n ≤ 10^5. Read limits first.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Memorize this cutoff, then write it on paper from memory: n ≤ 20 can be 2^n; n ≤ 10
 * or 11 can be n!; n ≤ 500 can be n^3; n ≤ 2,000 to 5,000 can be n^2; n ≤ 10^5 needs n log n; n ≤
 * 10^6 needs about O(n).
 *
 * [required] For three imaginary problems, say out loud which cutoff applies and reject one
 * approach that is too slow. Do not code them.
 *
 * [required] Solve maximum subarray (Kadane). State why O(n^2) dies at n = 10^5 before you code
 * O(n).
 *
 * [required] Solve a pair-sum or two-sum with a hash map. Say what happens if you use two nested
 * loops at n = 10^5.
 *
 * [required] Take one problem you already solved and rewrite the first comment as the complexity
 * and the limit that justifies it.
 *
 * [stretch] Time a deliberate O(n^2) loop at n = 5,000 in your language so you feel the limit,
 * then delete it.
 *
 * You are done when: You can reject an algorithm from the constraints in under a minute, on paper,
 * with no code.
 *
 * Pitfalls:
 * - Sample size is not the constraint. The limit is.
 * - A hidden log factor from a map or sort still counts. Say it.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day02
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day02 {
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
