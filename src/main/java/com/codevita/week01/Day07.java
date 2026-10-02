package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 7 — Week 1 checkpoint
 * Week 1. Budget about 150 minutes.
 *
 * Re-solve without notes, then fix the one pattern that broke.
 *
 * Why this is in the plan: Contest strength is re-solving, not recognizing a problem you already
 * opened.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Set a 2-hour timer. Solve three problems you have not opened this week: one array or
 * prefix, one string, one sort or window. No editorials until the timer ends.
 *
 * [required] Score only full correct solutions. A bug you 'almost' fixed is not a solve.
 *
 * [required] For every miss, label it misread, wrong complexity, or implementation bug. Repair
 * only that label.
 *
 * [required] Answer the review questions in the note.
 *
 * You are done when: At least two of the three timed problems are fully correct, and the note
 * names one repeated mistake.
 *
 * Pitfalls:
 * - Do not add a new topic today. A leaky week 1 makes week 5 useless.
 *
 * Write this in your note:
 * - Which input shape still slows you down?
 * - Which cutoff (n^2 versus n log n) did you hesitate on?
 * - What will you put at the top of the template tomorrow?
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day07
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day07 {
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
