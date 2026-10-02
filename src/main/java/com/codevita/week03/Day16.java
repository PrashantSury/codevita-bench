package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 16 — Binary search on the answer
 * Week 3. Budget about 190 minutes.
 *
 * Search the smallest or largest value whose yes/no check is monotone.
 *
 * Why this is in the plan: Minimum effort, minimum capacity, minimum days: if raising the guess
 * only makes the check easier, you can binary search the guess.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Write the template: low, high, and check(mid). Decide whether you want the first true
 * or the last true. Say which bound you keep.
 *
 * [required] Monotone means: once check becomes true, it stays true (or the opposite). If you
 * cannot say that sentence for a problem, do not binary search it.
 *
 * [required] Koko eating bananas. Check whether a speed finishes in H hours. Search the minimum
 * speed.
 *
 * [required] Capacity to ship packages within D days. Same shape, different check.
 *
 * [required] Build one original check: you are given tasks with durations and K workers. Find the
 * minimum time limit so the work fits. The check is a greedy pack. Test K = 1 and K = number of
 * tasks.
 *
 * [stretch] A third classic only if the first two took under 40 minutes each.
 *
 * You are done when: You can write check() in words before any code, for a new statement.
 *
 * Pitfalls:
 * - The search range must include a known feasible high. 'High = sum' or 'high = max' has to be
 * justified.
 * - An off-by-one in check (hours versus days) fails hidden tests while the binary search itself
 * is fine.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day16
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day16 {
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
