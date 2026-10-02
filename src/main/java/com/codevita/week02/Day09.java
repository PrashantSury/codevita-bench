package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 9 — GCD, LCM, and factors
 * Week 2. Budget about 170 minutes.
 *
 * Use Euclid, compute LCM without overflow, and list factors in sqrt time.
 *
 * Why this is in the plan: Ratios, 'reduce the fraction', and repeating structure often collapse
 * to GCD.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Implement gcd(a, b). Then lcm(a, b) = a / gcd * b, dividing before multiplying so the
 * product does not overflow.
 *
 * [required] List factors of n by looping i to sqrt(n). Include both i and n/i. Test a perfect
 * square so you do not double-count the root.
 *
 * [required] Reduce a fraction a/b to lowest terms, including negative numbers and b = 0 as an
 * invalid input you detect.
 *
 * [required] GCD of a whole array, and LCM of a whole array under a modulus or with an overflow
 * story. If LCM exceeds 64-bit, stop and say so instead of wrapping.
 *
 * [required] Count how many numbers from 1 to N are divisible by A or B, using inclusion: N/A +
 * N/B − N/lcm(A,B).
 *
 * [stretch] Factorize n with smallest prime factor if you built it yesterday.
 *
 * You are done when: gcd, lcm, and factor listing pass a perfect square, a prime, and 1.
 *
 * Pitfalls:
 * - lcm(0, x) is a trap. Define it before the contest, and match the statement.
 * - Integer division order in LCM is the overflow bug. Divide first.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day09
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day09 {
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
