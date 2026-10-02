package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 26 — Rule simulations
 * Week 4. Budget about 200 minutes.
 *
 * Turn a paragraph of rules into state, a transition, and a stop, then test the edges.
 *
 * Why this is in the plan: Wet and dry seats, music tiles, beetles, and caves are this. The
 * algorithm name does not matter. The state does.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] For any story: list the nouns that change. That list is your state. List the verbs.
 * Those are transitions. Find the sentence that says when to stop.
 *
 * [required] If a rule is ambiguous, the sample is the spec. Build a second case yourself that
 * stresses a different rule.
 *
 * [required] Design and solve: a row of blocks, some wet. A person sits only on a dry block and
 * wets the adjacent dry blocks afterward, or whatever rule you write down first. The point is to
 * freeze the rule, then code that rule, not a nicer one. Hand-simulate 6 blocks.
 *
 * [required] Simulate a beetle or token moving on a number line with forward and turn commands.
 * Include a command that would walk past the end.
 *
 * [required] Open one archive story problem. Spend 15 minutes with no code: state, transitions,
 * stop, and three tests. Then code for 40 minutes. If it is not done, submit nothing and write
 * what state you missed.
 *
 * [stretch] A second archive problem only as a reading exercise, no code, 15 minutes.
 *
 * You are done when: One story problem's hand simulation and program agree on the sample and on
 * your extra case.
 *
 * Pitfalls:
 * - Coding while still unsure which noun is the state. Stop and list them.
 * - Changing the rule because it is easier to code. The judge uses the statement.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day26
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day26 {
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
