package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 42 — Week 6 checkpoint
 * Week 6. Budget about 200 minutes.
 *
 * One graph, one DP, one math, one simulation, in three hours.
 *
 * Why this is in the plan: This mix is the qualifier shape: you will not get six graphs, and you
 * will not get six easy strings.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Three hours. Four problems, one of each family. Read all, order them, full solves
 * only.
 *
 * [required] Template is allowed. Fresh editorials are not. If a graph problem is unweighted, BFS.
 * Write that choice down before coding.
 *
 * [required] Answer the review questions. Tag the miss as the wrong model, not as 'I needed more
 * practice' in the abstract.
 *
 * You are done when: Three hours completed, and at least two full solves, with the misses tagged
 * by model.
 *
 * Pitfalls:
 * - Spending the three hours on one hard graph. That loses the contest.
 *
 * Write this in your note:
 * - Which problem did you model wrong?
 * - Did you use Dijkstra where BFS was enough?
 * - Which template function was missing when you needed it?
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day42
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day42 {
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
