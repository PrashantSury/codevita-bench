package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 6 — Two pointers and windows
 * Week 1. Budget about 180 minutes.
 *
 * Shrink a pair or a window instead of checking every subarray.
 *
 * Why this is in the plan: When the array is sorted, or the window only grows and shrinks from the
 * ends, nested loops are the wrong first idea.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Write the two invariants: sorted pair moving inward, and a window [L, R] where you
 * only advance L when the window is illegal.
 *
 * [required] Prove to yourself that each index enters and leaves the window at most once, so the
 * scan is linear after the sort.
 *
 * [required] Container with most water. Move the shorter side. Say why moving the taller side
 * cannot help.
 *
 * [required] 3Sum. Sort, fix one index, two pointers, skip duplicates.
 *
 * [required] Minimum size subarray sum, positive numbers only, sliding window.
 *
 * [stretch] One extra: longest window with at most K distinct characters. Reuse day 4's window.
 *
 * You are done when: You can point at a statement and say 'window' or 'not a window' in two
 * minutes.
 *
 * Pitfalls:
 * - Sliding window on arrays with negative numbers is usually wrong. Stop and switch tools.
 * - Forgetting to skip duplicates on 3Sum produces a right sample and a wrong judge.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day06
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day06 {
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
