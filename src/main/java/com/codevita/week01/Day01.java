package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 1 — The input contract
 * Week 1. Budget about 180 minutes.
 *
 * Read every input shape you will see, and print exactly what the statement asks.
 *
 * Why this is in the plan: A correct idea fails if the grid is transposed, an extra line is
 * printed, or you assumed multiple test cases when the statement has one instance.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Pick one language and do not switch for eight weeks. Python if you want to type
 * simulations faster. C++ if you already write it cleanly. Java only with BufferedReader. C only
 * if it is already fluent.
 *
 * [required] Save a blank template you will copy for every problem: read all input, a solve
 * function, then print. Put it where you can open it in one click.
 *
 * [required] Write down the four input shapes: one integer, a line of integers, N then N lines,
 * and a full line of text that may contain spaces.
 *
 * [required] From a blank file, read N then N integers and print their sum. Use a 64-bit integer.
 * Test N = 1 and a sum bigger than 2^31 − 1.
 *
 * [required] Read R and C, then R lines of C integers, and print the transpose. Check R = 1 and C
 * = 1.
 *
 * [required] Read one full line and print the number of words. The sample with double spaces must
 * match your hand count.
 *
 * [stretch] Solve one easy implementation on any judge and diff your output against the sample,
 * including the final newline.
 *
 * [required] In today's note, write the input rule you almost got wrong and the exact print format
 * you will use.
 *
 * You are done when: You can parse those four shapes from a blank file in under 15 minutes, and
 * the template file exists.
 *
 * Pitfalls:
 * - CodeVita problems often have a single input, not T test cases. Read the Input section. Do not
 * invent T.
 * - Debug prints are wrong answers. Remove them before you submit.
 * - Python int is safe. C++ int, Java int, and C int are not. Sums and products start as 64-bit.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day01
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day01 {
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
