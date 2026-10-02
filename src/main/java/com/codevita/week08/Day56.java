package com.codevita.week08;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 56 — Short rehearsal or rest
 * Week 8. Budget about 120 minutes.
 *
 * If the real round is tomorrow, rest. If it is still days away, sit a short mock.
 *
 * Why this is in the plan: Nothing you learn today changes your ceiling. Sleep and a clean
 * template do.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] If the round is within 24 hours: no problems. Walk, check the login, stop.
 *
 * [required] Otherwise: two hours, three problems, easiest first, then stop even if you want a
 * fourth.
 *
 * [required] Answer the review questions. That is the end of the repository.
 *
 * You are done when: You either rested on purpose, or you stopped the short mock on time.
 *
 * Pitfalls:
 * - Believing an unofficial solve count guarantees a Ninja, Digital, or Prime interview. Past
 * seasons have used CodeVita as a hiring signal. Thresholds move, and a rank is not an offer.
 *
 * Write this in your note:
 * - What is your solve target for the first round?
 * - Which three template functions will you actually use?
 * - What is the first thing you will do in minute 1? Read all the problems.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week08.Day56
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day56 {
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
