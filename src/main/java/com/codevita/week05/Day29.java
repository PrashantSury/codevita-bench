package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 29 — One-dimensional DP
 * Week 5. Budget about 190 minutes.
 *
 * Solve a recurrence with a table, and say why recursion without memory explodes.
 *
 * Why this is in the plan: Qualifier problems start to prefer DP. Round 1 sometimes hides a
 * one-dimensional recurrence inside a story.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Climbing stairs: dp[i] = dp[i-1] + dp[i-2], with dp[0] and dp[1] written down. Then
 * rewrite it with two variables. Both answers match for n = 5.
 *
 * [required] The sentence you must write before every DP this week: state means ___, transition is
 * ___, base case is ___.
 *
 * [required] House robber. State: best using the prefix of houses, with the last house taken or
 * not. Do not look up the transition until you have a wrong one to compare.
 *
 * [required] Coin change: fewest coins for amount. The greedy counterexample from day 17 (coins 1,
 * 3, 4, amount 6) must return 2.
 *
 * [required] Min cost climbing stairs. Same family as climbing stairs.
 *
 * [stretch] A story version: a board of n ≤ 10^5 cells, from i you may jump 1 or 2, some cells are
 * blocked. Count ways mod 10^9+7. This is climbing stairs plus zeros. O(n) is required.
 *
 * You are done when: You can say the state sentence for house robber without looking, and the coin
 * counterexample returns 2.
 *
 * Pitfalls:
 * - Writing a loop because the editorial had a loop, with no state sentence.
 * - Using 32-bit integers for a ways-count. Use 64-bit, then mod.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day29
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day29 {
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
