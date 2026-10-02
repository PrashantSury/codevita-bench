package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 35 — Rewrite the DP from blank
 * Week 5. Budget about 180 minutes.
 *
 * If you cannot retype it, you do not know it.
 *
 * Why this is in the plan: Templates you cannot rebuild under a timer are decorations.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Without notes, retype: house robber, 0/1 knapsack, coin change (fewest coins), and
 * minimum path sum. Run one test each.
 *
 * [required] For any failure, write the state sentence, delete the function, and retype it.
 * Reading the old file does not count.
 *
 * [required] Answer the review questions. Add only the four functions that passed into a dp
 * section of your template, with the state sentence as a comment.
 *
 * You are done when: Four DP functions, retyped today, each pass one test.
 *
 * Pitfalls:
 * - Keeping a function you only half remember. Delete it.
 *
 * Write this in your note:
 * - Which state sentence did you forget?
 * - Which loop direction did you almost reverse?
 * - Which problem this week was actually a graph?
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day35
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day35 {
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
