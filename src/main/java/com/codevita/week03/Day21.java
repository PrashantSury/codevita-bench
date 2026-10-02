package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 21 — Week 3 checkpoint
 * Week 3. Budget about 180 minutes.
 *
 * Four mixed problems, easiest first, full solutions only.
 *
 * Why this is in the plan: The contest skill is choosing the order. You do it here before you do
 * it for six hours.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] 150 minutes, four problems: one binary search on the answer, one greedy or
 * sort-then-scan, one stack, one from weeks 1–2. Spend the first 10 minutes ordering them. Start
 * with the one you can finish.
 *
 * [required] If you have no idea after 20 minutes, leave it. Brute force is allowed when the limit
 * allows it, and you must say that limit in a comment.
 *
 * [required] Answer the review questions. Upsolve exactly one unsolved problem tonight, not all of
 * them.
 *
 * You are done when: At least three of four are fully correct, and you upsolved one miss without
 * reading a full editorial first.
 *
 * Pitfalls:
 * - Do not start week 4 late. Story problems need the whole next week.
 *
 * Write this in your note:
 * - Did you start with the easiest problem?
 * - Which problem was monotone and searchable?
 * - Where did a greedy feel right and then fail a 4-element case?
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day21
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day21 {
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
