package com.codevita.week01;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 3 — Arrays, counts, prefixes
 * Week 1. Budget about 180 minutes.
 *
 * Answer range questions and frequency questions without rescanning.
 *
 * Why this is in the plan: Rock samples, ranges, and 'how many between L and R' are prefix or
 * frequency problems wearing a story.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Implement a prefix array: prefix[0] = 0, prefix[i] = prefix[i-1] + a[i-1]. Range sum
 * [L, R] inclusive is prefix[R+1] − prefix[L]. Test this on paper with four numbers.
 *
 * [required] Implement a frequency map and a frequency array. Know when the values are small
 * enough for an array.
 *
 * [required] Range sum query: build the prefix once, answer several ranges.
 *
 * [required] Subarray sum equals K with a prefix map. If you cannot say the state in one sentence,
 * do not start typing.
 *
 * [required] Given intervals of rock sizes and several queries [L, R], count how many rocks fall
 * in each query. Brute force is allowed only if you first name the limits that make it legal. Then
 * write the prefix version anyway.
 *
 * [stretch] Product of array except self, without using division.
 *
 * You are done when: Prefix sum and a frequency count are templates you can type without looking.
 *
 * Pitfalls:
 * - Off-by-one on inclusive ranges is the whole bug. Test L = R.
 * - A frequency array of size 10^9 will not exist. Use a map, or compress the values.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day03
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day03 {
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
