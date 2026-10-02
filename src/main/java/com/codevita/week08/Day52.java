package com.codevita.week08;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 52 — Second full mock
 * Week 8. Budget about 380 minutes.
 *
 * Repeat the six-hour sitting with new problems and the same rules.
 *
 * Why this is in the plan: The second mock tells you whether day 51 changed anything. The first
 * one only told you the truth.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] New set. Same rules as day 50, including local saves and a hard stop.
 *
 * [required] Aim at your written target from day 49. If you hit it early, spend the rest making
 * those solves bulletproof, then one more problem.
 *
 * [required] Compare the solve count to day 50 in the note, and the reason for any drop.
 *
 * You are done when: Second six-hour sit completed, with a written comparison to the first mock.
 *
 * Pitfalls:
 * - Reusing a problem you already upsolved. That inflates the count.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week08.Day52
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day52 {
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
