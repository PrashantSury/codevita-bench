package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 4 — Strings as data
 * Week 1. Budget about 180 minutes.
 *
 * Normalize, count, and scan strings without getting lost in the story.
 *
 * Why this is in the plan: Anagrams, palindromes, codes, and 'rearrange these characters' are
 * string problems. The story is decoration.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] List the operations you will use: index, slice, reverse, count characters, sort
 * characters, two pointers from both ends. Type a tiny example of each.
 *
 * [required] Decide case and whitespace before coding. The statement's example is the spec if the
 * text is ambiguous.
 *
 * [required] Valid anagram, using a count of 26 or a map. Do not sort unless you mean to.
 *
 * [required] Valid palindrome, skipping non-alphanumerics, case-insensitive.
 *
 * [required] Longest substring without repeating characters. Write the window invariant in a
 * comment before the loop.
 *
 * [stretch] Group anagrams. The key is the sorted word or the count signature.
 *
 * You are done when: You can say whether a string task is a count, a window, or two pointers
 * before opening the editor.
 *
 * Pitfalls:
 * - Strings are immutable in some languages. Building them with + inside a loop can be quadratic.
 * Use a buffer.
 * - Indexing a character is not the same as indexing a Unicode code point. CodeVita text is almost
 * always plain ASCII. Don't build a Unicode library.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day04
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day04 {
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
