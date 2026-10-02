package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 39 — Dijkstra
 * Week 6. Budget about 190 minutes.
 *
 * Shortest paths with non-negative weights, with a priority queue, and no negative edges.
 *
 * Why this is in the plan: Use this when edges have different positive costs. If every cost is 1,
 * go back to BFS.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] The algorithm: distance array starts at infinity, source at 0. Pop the smallest
 * tentative distance. If you pop a stale pair worse than the recorded distance, skip it. Relax
 * neighbors.
 *
 * [required] State the ban: a negative edge makes this wrong. You will not need Bellman-Ford for
 * CodeVita prep unless a problem forces negative edges. If it does, and n is small, Bellman-Ford
 * is the fallback. Do not memorize Floyd for n > 400.
 *
 * [required] Network delay time: Dijkstra from node k, answer is the maximum finite distance, or
 * -1 if some node is unreachable.
 *
 * [required] A grid where moving into a cell costs that cell's value, four directions, all costs
 * non-negative. Dijkstra, not plain BFS. Test a grid of all zeros, where the answer is 0 or the
 * start cost, matching the statement you chose.
 *
 * [stretch] Second shortest path is out of scope. Skip it.
 *
 * You are done when: A 4-node hand graph matches the distance array, including one unreachable
 * node.
 *
 * Pitfalls:
 * - Not skipping stale queue entries. You get the right answer slowly, or a TLE.
 * - Using Dijkstra on negative weights. The sample can still pass.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day39
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day39 {
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
