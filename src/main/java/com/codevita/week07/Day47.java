package com.codevita.week07;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 47 — Repair the repeated miss
 * Week 7. Budget about 180 minutes.
 *
 * Only the pattern that has failed most often in your notes.
 *
 * Why this is in the plan: A random new topic feels productive and does not change your rank.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Read your notes from days 7, 14, 21, 28, 35, and 42. Pick the single most repeated
 * label: misread, simulation, DP state, graph model, or overflow and edges.
 *
 * [required] Five focused problems of that one label, easier than your ego wants. Full tests,
 * including the edge checklist.
 *
 * [required] Retype the one template function associated with that label.
 *
 * You are done when: Five problems of one family, and a sentence that states the rule you were
 * breaking.
 *
 * Pitfalls:
 * - Repairing three weaknesses badly instead of one properly.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week07.Day47
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day47 {
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
