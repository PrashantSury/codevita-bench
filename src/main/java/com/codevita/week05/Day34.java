package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 34 — String DP
 * Week 5. Budget about 180 minutes.
 *
 * Edit distance and palindrome subsequence, with the table indexed by prefixes.
 *
 * Why this is in the plan: These appear more in later rounds. Learn the table now so a qualifier
 * problem is not the first time you see it.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Edit distance: insert, delete, replace. If characters match, the diagonal is free.
 * Hand-fill a 3-character example.
 *
 * [required] You do not need Knuth-Morris-Pratt this week. If a problem is 'does this pattern
 * occur', a direct scan is enough unless the limits say otherwise.
 *
 * [required] Edit distance matching the hand table.
 *
 * [required] Longest palindromic subsequence. It is LCS of the string with its reverse. Say that,
 * then code either form.
 *
 * [stretch] Regular expression matching is out of scope. Skip it even if you feel ambitious. It
 * will not be the difference in Round 1.
 *
 * You are done when: The 3-character edit-distance table matches the program.
 *
 * Pitfalls:
 * - Off-by-one because strings are 1-indexed in the table and 0-indexed in the language.
 * - Palindrome subsequence is not palindrome substring. The word again.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day34
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day34 {
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
