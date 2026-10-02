package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 24 — Grids and movement
 * Week 4. Budget about 180 minutes.
 *
 * Simulate a walker on a grid with hurdles, wraps, and a clear stop.
 *
 * Why this is in the plan: Portal samples include grid navigation with hurdles and tiles. This is
 * direct simulation or BFS, and you choose from the question: one path you must follow, or the
 * shortest path.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Represent four directions as a list of deltas, not as four copied blocks. Include a
 * facing index if the story turns left and right instead of jumping to a neighbor.
 *
 * [required] Decide: if the statement says 'follows these moves', simulate. If it says 'minimum
 * steps', that is BFS and you will do it properly in week 6. Today, simulate, and write BFS only
 * if you already can.
 *
 * [required] Flood fill or number of islands, 4-directional. Count components. This is DFS or BFS
 * on a grid.
 *
 * [required] A walker starts facing a direction. Commands are L, R, and F. Hurdles block F. Print
 * the final cell or 'stuck'. Build a 3×3 example by hand first.
 *
 * [required] Add a wrap-around variant: leaving the right edge enters the left. Confirm the hand
 * example.
 *
 * [stretch] Rotting oranges, multi-source BFS, if islands already felt easy.
 *
 * You are done when: The 3×3 walker with one hurdle matches your hand trace, including the stuck
 * case.
 *
 * Pitfalls:
 * - Mixing up row and column when reading input. Print the sample grid back out before solving.
 * - Marking visited after the recursive call instead of before, which re-enters the same cell.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day24
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day24 {
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
