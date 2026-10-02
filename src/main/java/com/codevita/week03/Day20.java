package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 20 — Stacks, queues, monotonic stacks
 * Week 3. Budget about 180 minutes.
 *
 * Model 'nearest greater' and 'undo the last open thing' with the right linear structure.
 *
 * Why this is in the plan: Nested brackets, previous greater height, and process-in-arrival-order
 * are stack and queue problems hidden in stories.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Valid parentheses with a stack. Then one mismatch case and one extra-closer case.
 *
 * [required] Monotonic stack for the next greater element to the right. Each index is pushed and
 * popped at most once.
 *
 * [required] Valid parentheses, including an empty string.
 *
 * [required] Daily temperatures, or next greater element. Draw the stack for a 5-element array
 * before coding.
 *
 * [required] Implement a queue using two stacks only if you want the exercise. Otherwise implement
 * a normal queue and use it to simulate a line of people with an arrival rule you invent. The
 * point is the model, not the library.
 *
 * [stretch] Largest rectangle in a histogram only as a stretch. It is the same monotonic stack,
 * harder bookkeeping.
 *
 * You are done when: Next greater on a 5-element hand example matches the program.
 *
 * Pitfalls:
 * - Popping until empty and forgetting to leave the new element on the stack.
 * - Stack of values versus stack of indexes. Distances need indexes.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day20
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day20 {
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
