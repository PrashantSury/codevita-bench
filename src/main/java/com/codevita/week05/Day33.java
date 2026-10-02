package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 33 — Subset sums and partitions
 * Week 5. Budget about 180 minutes.
 *
 * Use boolean DP for 'can you make this sum' and notice when the sum is too large for a table.
 *
 * Why this is in the plan: Split, fair teams, and target totals are this, as long as the sum fits
 * in memory.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Boolean knapsack: can[s] is true if a subset makes s. Iterate s downward for each
 * number. can[0] starts true.
 *
 * [required] Memory check: if the target sum is 10^12, you cannot allocate it. Say the
 * alternative: meet in the middle if n ≤ 40, or a different model.
 *
 * [required] Partition equal subset sum again, from a blank file, in under 25 minutes.
 *
 * [required] Given n ≤ 20, count subsets with sum S using masks, and also using DP if the sum ≤
 * 10^5. The counts match on a small case.
 *
 * [required] Minimum subset sum difference. It is the subset sum closest to total/2.
 *
 * [stretch] Target sum with plus and minus signs. Shift the sums so the index is non-negative.
 *
 * You are done when: You can reject boolean DP in one sentence when the sum cannot be an index.
 *
 * Pitfalls:
 * - Upward boolean loop reuses the same number. Same bug as day 30.
 * - n = 40 and sum = 10^9 is not this chapter. Meet in the middle splits the array in half.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day33
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day33 {
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
