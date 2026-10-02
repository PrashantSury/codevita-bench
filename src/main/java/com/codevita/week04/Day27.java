package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 27 — Edges and hand tests
 * Week 4. Budget about 160 minutes.
 *
 * Build the tests that hidden cases actually are: empty, one, duplicates, borders, overflow.
 *
 * Why this is in the plan: Most wrong answers after a passing sample are an edge you never wrote
 * down.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Write this list into the template as a comment you will not delete: n = 0 if allowed,
 * n = 1, all values equal, already sorted, reverse sorted, maximum value, negative if allowed,
 * first cell, last cell, no possible answer.
 *
 * [required] For the last story problem you solved, add two of those cases and run them. Fix what
 * breaks.
 *
 * [required] Re-open two earlier solutions that you only tested on the sample. Add the checklist
 * cases. Fix them.
 *
 * [required] One overflow drill: multiply two maximum legal inputs in your language and print the
 * type you stored. If it wrapped, change the type.
 *
 * [stretch] Time-box a problem you previously skipped. Fifteen minutes of reading, then either a
 * brute force that fits the limit or a written reason you cannot start.
 *
 * You are done when: Two old solutions gained new tests, and at least one bug was either fixed or
 * proven absent by those tests.
 *
 * Pitfalls:
 * - Adding tests after you 'know' it works teaches nothing. Run them.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day27
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day27 {
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
