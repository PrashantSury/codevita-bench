package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 32 — Grid DP
 * Week 5. Budget about 180 minutes.
 *
 * Paths and minimum costs on a grid, including blocked cells.
 *
 * Why this is in the plan: A grid with 'minimum cost' or 'number of ways' and only right/down
 * moves is DP, not BFS, unless the costs can be negative or the moves are free in four directions.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Unique paths: ways to reach (i,j) is ways from the top plus ways from the left. First
 * row and first column are 1 if unblocked.
 *
 * [required] If you can move four ways or must avoid cycles, this table is wrong. That is a graph.
 * Label it and wait for week 6.
 *
 * [required] Unique paths, then unique paths II with obstacles. An obstacle on the start makes the
 * answer 0.
 *
 * [required] Minimum path sum, right and down only.
 *
 * [required] A variant you write: some cells add a bonus, moves still only right and down,
 * maximize the sum. Same table, max instead of min.
 *
 * [stretch] Triangle, minimum path from top to bottom. It is a ragged grid.
 *
 * You are done when: A 2×2 grid you fill by hand matches both the ways program and the min-sum
 * program.
 *
 * Pitfalls:
 * - Going four directions with a DP table double-counts or loops. Stop.
 * - Modulo the ways if the statement says so. A bare integer overflows.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day32
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day32 {
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
