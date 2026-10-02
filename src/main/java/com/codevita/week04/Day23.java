package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 23 — Backtracking that prunes
 * Week 4. Budget about 190 minutes.
 *
 * Stop a branch as soon as it violates a constraint, and test the prune with a tiny case.
 *
 * Why this is in the plan: Seating, grids with forbidden cells, and puzzles are backtracking when
 * the limit is small and a formula is not obvious.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] The shape: choose, explore, undo. Add a prune before explore. If you never undo, the
 * next branch sees a dirty board.
 *
 * [required] Always write the stop condition: a complete placement, or a dead end.
 *
 * [required] Word search on a small board. Mark the cell visited and unmark it.
 *
 * [required] N-queens for n = 4 first, count the solutions by hand (2), then code n = 8. If n = 8
 * is slow to debug, stay at n = 4 until the count is right.
 *
 * [required] A seating miniature: 4 seats, some pairs cannot be adjacent. Count valid fillings of
 * 4 distinct people by backtracking. Check it against a full permutation loop.
 *
 * [stretch] Sudoku solver only if N-queens for n = 4 is already solid.
 *
 * You are done when: N-queens n = 4 returns 2, and the seating miniature matches the permutation
 * count.
 *
 * Pitfalls:
 * - Pruning after you append, and forgetting to pop on the failure path.
 * - Using backtracking on n = 100. It will not finish. Go back to the limit.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day23
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day23 {
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
