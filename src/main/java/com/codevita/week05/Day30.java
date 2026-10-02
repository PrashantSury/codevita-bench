package com.codevita.week05;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 30 — Knapsack
 * Week 5. Budget about 190 minutes.
 *
 * Tell 0/1 knapsack from unbounded knapsack by the direction of the inner loop.
 *
 * Why this is in the plan: Capacity plus items is knapsack even when the story is about trucks,
 * time, or budget.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] 0/1: each item once, so iterate capacity downward. Unbounded: each item many times,
 * so iterate capacity upward. Write both loops and a one-line comment on each.
 *
 * [required] Hand-fill a table for items (weight, value) = (1,1), (2,4), (3,6) and capacity 4. Do
 * this before code.
 *
 * [required] 0/1 knapsack matching your hand table. If the code disagrees, the code is wrong.
 *
 * [required] Coin change II: number of combinations, unbounded, so the inner loop direction
 * matters. Combinations, not permutations.
 *
 * [required] Partition equal subset sum. It is 0/1 knapsack for sum/2. If the total is odd, answer
 * immediately.
 *
 * [stretch] Unbounded knapsack maximum value, same items as the hand table, to see the loop
 * direction change the answer.
 *
 * You are done when: The hand table and the 0/1 program match, and you can say which loop
 * direction uses an item once.
 *
 * Pitfalls:
 * - Upward loop on 0/1 uses an item more than once. That is a different problem.
 * - Capacity in the billions cannot be a DP index. Then it is greedy or binary search, not this
 * table.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week05.Day30
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day30 {
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
