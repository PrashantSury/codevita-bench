package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 31 — LIS and LCS
 * Week 5. Budget about 190 minutes.
 *
 * Know the O(n^2) versions cold, and the limit that forces the faster LIS.
 *
 * Why this is in the plan: Subsequence problems show up when the story says order is kept but
 * contiguity is not. Contiguous means subarray or substring, not subsequence.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Define the words in your note: subarray is contiguous, subsequence keeps order,
 * subset does not. Misreading this word fails the problem.
 *
 * [required] LCS: dp[i][j] is the answer for the prefixes. If the last characters match, 1 +
 * diagonal, else the max of dropping one side. Base row and column are 0.
 *
 * [required] Longest increasing subsequence, O(n^2). Hand-run 10,9,2,5,3,7,101,18. The length is
 * 4.
 *
 * [required] If you finish early, learn the patience-sorting O(n log n) LIS only as a second
 * method. Do not replace the O(n^2) until you can explain the piles.
 *
 * [required] Longest common subsequence on two short strings you compute by hand first.
 *
 * [stretch] Longest common substring, which is contiguous, so the transition resets to 0 on a
 * mismatch. Different problem. Say so in the comment.
 *
 * You are done when: LIS length 4 on the famous example, and a 3-by-3 LCS table you filled by hand
 * matches the code.
 *
 * Pitfalls:
 * - Subsequence versus substring. Read the word twice.
 * - O(n^2) LIS at n = 10^5 will not pass. Switch methods or notice it is a different problem.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day31
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day31 {
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
