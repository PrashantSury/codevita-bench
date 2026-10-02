package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 17 — Greedy you can justify
 * Week 3. Budget about 180 minutes.
 *
 * Take the local choice only after you try to break it with a tiny example.
 *
 * Why this is in the plan: Greedy fails loudly on CodeVita when the story has a global constraint
 * you ignored. A 4-element counterexample is cheaper than a wrong submission.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Interval scheduling: sort by end time, take the next interval that starts after the
 * last end. Invent four intervals where sorting by start gives the wrong answer.
 *
 * [required] The rule for today: if you cannot find a counterexample in ten minutes, code the
 * greedy and test the sample plus your four-element case.
 *
 * [required] Non-overlapping intervals: minimum removals, which is the scheduling argument.
 *
 * [required] Jump game: can you reach the end? Then, if time, jump game II for the minimum jumps.
 *
 * [required] Assign cookies: smallest child who accepts this cookie, after sorting both arrays.
 *
 * [stretch] A case where greedy fails: coin change with coins 1, 3, 4 and amount 6. Greedy takes
 * 4+1+1, optimal is 3+3. Write that down so you remember DP exists.
 *
 * You are done when: You have one written counterexample where a tempting greedy is wrong, and two
 * greedies that survived.
 *
 * Pitfalls:
 * - Sorting by the wrong field is the entire bug. Name the field in the first comment.
 * - Greedy coin change only works for canonical coin systems. Do not assume it.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day17
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day17 {
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
