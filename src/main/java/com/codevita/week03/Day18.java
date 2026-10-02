package com.codevita.week03;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 18 — Heaps
 * Week 3. Budget about 170 minutes.
 *
 * Keep the current best K, or always expand the best next choice, in log time.
 *
 * Why this is in the plan: Minimum gifts in a row with neighbor constraints, and 'always process
 * the current largest', are heap or greedy-scan problems.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Use the library heap. Do not implement sift-up unless you are in C and have no
 * library. Know how to get a max-heap if the library is a min-heap (negate, or a comparator).
 *
 * [required] State the cost: each push and pop is log n. A loop of n pops is n log n.
 *
 * [required] Kth largest element. Heap of size K, and also the sort solution. Say when each is
 * appropriate.
 *
 * [required] Last stone weight. Simulate with a heap and check a three-stone hand example.
 *
 * [required] Minimum gifts: people in a row, each must get at least one, and a strictly higher
 * rating than a neighbor means strictly more gifts than that neighbor. Two passes beat a heap.
 * Solve it and note that the heap was the wrong tool.
 *
 * [stretch] Task scheduler, if the first three are done.
 *
 * You are done when: You can say 'heap' or 'two passes' for the gifts problem and defend it.
 *
 * Pitfalls:
 * - A heap does not sort the whole array for you. If you need full order, sort.
 * - Duplicate values and the comparator's equality case must be tested.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week03.Day18
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day18 {
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
