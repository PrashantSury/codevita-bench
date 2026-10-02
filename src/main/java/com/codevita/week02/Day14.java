package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 14 — Week 2 checkpoint
 * Week 2. Budget about 150 minutes.
 *
 * A timed math set, then a template update.
 *
 * Why this is in the plan: In the contest you will not have the sieve open in a tutorial tab that
 * you trust. It has to be in your file.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Two hours, three problems: one sieve, one GCD or inclusion count, one digit
 * construction. No notes for the first attempt.
 *
 * [required] After the timer, you may open your template. Anything you could not type is not
 * learned. Re-type it tonight into the template.
 *
 * [required] Answer the review questions in the note. Update the template with only the functions
 * you re-typed correctly.
 *
 * You are done when: Template contains sieve, gcd, lcm, and modpow, each with one passing test you
 * ran today.
 *
 * Pitfalls:
 * - Do not add segment trees, FFT, or matrix exponentiation. They are not the Round 1 bottleneck.
 *
 * Write this in your note:
 * - Can you type sieve and modpow from a blank file?
 * - Where did overflow or a negative modulo almost happen?
 * - Which problem was really simulation, not math?
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day14
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day14 {
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
