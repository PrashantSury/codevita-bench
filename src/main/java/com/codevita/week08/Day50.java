package com.codevita.week08;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 50 — Full mock
 * Week 8. Budget about 380 minutes.
 *
 * Sit a six-hour contest with contest rules.
 *
 * Why this is in the plan: Recent seasons are widely described as a long window, often six hours
 * and about six problems. Confirm the live duration on the portal. Train for the long one.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Six problems if you can assemble them, otherwise five. Six hours. Timer does not
 * pause when you stand up.
 *
 * [required] Water and a paper protocol: output in one sentence, input shape, limits, model, three
 * tests. Paper is allowed. Solution sites are not, except your own template.
 *
 * [required] Save every file locally as you go. In the real contest, closing the browser drops
 * unsaved code, and inactivity around 15 minutes can expire the session.
 *
 * [required] Read every problem for 15 to 20 minutes. Order them. Start with a sure solve.
 *
 * [required] If an idea is not forming at 25 minutes, leave the problem.
 *
 * [required] Last 30 minutes: fix tests and resubmit. Do not open a new hard problem.
 *
 * [required] Log full solves only, plus what you would have submitted.
 *
 * You are done when: You sat six hours, ordered the set first, and wrote a solve count with no
 * generosity.
 *
 * Pitfalls:
 * - Treating hour five as a reason to gamble on the hardest problem while an easy one is unfixed.
 * - Official MockVita, if it is open, replaces this day. Use the real interface.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week08.Day50
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day50 {
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
