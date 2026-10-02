package com.codevita.week07;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 44 — Archive, set two
 * Week 7. Budget about 200 minutes.
 *
 * Longer statements. The code should be the easy part.
 *
 * Why this is in the plan: Later seasons did not get shorter. Your reading has to get faster, not
 * your typing.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Two long story problems. Spend the first 20 minutes of each on state, transitions,
 * stop, and limits. No code during those 20 minutes.
 *
 * [required] If the limit allows a direct simulation, write it cleanly instead of inventing a
 * formula you are not sure of.
 *
 * [stretch] One short math problem as a palate cleanser if a story problem blocks you for 40
 * minutes.
 *
 * You are done when: Both stories have a written state list, and at least one is fully correct.
 *
 * Pitfalls:
 * - Optimizing a simulation that already fits the limits. Correct first.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week07.Day44
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day44 {
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
