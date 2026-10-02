package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 12 — Counting
 * Week 2. Budget about 180 minutes.
 *
 * Count with factorials, combinations, and inclusion-exclusion on a small set.
 *
 * Why this is in the plan: Seating and 'how many ways' problems are counting. If n is tiny,
 * enumerate. If n is large, find a formula or DP.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Compute nCr with a loop that reduces by the gcd at each step, or with factorials
 * under a prime modulus. Test C(5,2) = 10 and C(10,0) = 1.
 *
 * [required] Inclusion-exclusion for two and three properties, on paper, with a universe of 100
 * and three overlapping sets you invent.
 *
 * [required] How many numbers from 1 to N are not divisible by 2, 3, or 5? Use
 * inclusion-exclusion. Check N = 10 by hand.
 *
 * [required] Given n distinct people and a row of chairs with one empty constraint, compute the
 * count for n ≤ 10 by recursion or permutation, then look for the pattern.
 *
 * [required] If the answer is huge, print it mod 10^9+7 using day 10's multiply.
 *
 * [stretch] Pascal's triangle row for n ≤ 1000 under a modulus, in O(n) extra memory.
 *
 * You are done when: C(5,2), the inclusion-exclusion hand check, and one modular count all match.
 *
 * Pitfalls:
 * - C(n, k) with k > n is 0. Do not loop off the end.
 * - Factorial of 21 already exceeds 64-bit. Switch to modular factorial before that, not after a
 * silent overflow.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day12
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day12 {
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
