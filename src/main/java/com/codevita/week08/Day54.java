package com.codevita.week08;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 54 — Speed without sloppiness
 * Week 8. Budget about 180 minutes.
 *
 * Six easy-to-medium problems, about 25 minutes each, accuracy over heroics.
 *
 * Why this is in the plan: Round 1 rank is mostly the number of fully correct solutions, not the
 * hardest idea you touched.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Six problems you expect to finish. Stop each one at 25 minutes. Either it is correct
 * or you leave it.
 *
 * [required] After each, write the bug class if you slipped: format, edge, overflow, wrong model.
 *
 * [stretch] If you finish six early, redo one old archive problem from blank.
 *
 * You are done when: At least four of six fully correct inside the cuts.
 *
 * Pitfalls:
 * - Staying 50 minutes on problem one because it is 'almost' done. That is how you solve two.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week08.Day54
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day54 {
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
