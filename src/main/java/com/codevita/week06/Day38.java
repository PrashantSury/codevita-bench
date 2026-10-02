package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 38 — Shortest path without weights
 * Week 6. Budget about 180 minutes.
 *
 * BFS distance is the shortest path when every edge costs the same.
 *
 * Why this is in the plan: Minimum moves on a cave, a maze, or a grid of hurdles is unweighted
 * shortest path. Dijkstra is extra machinery here.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Store the distance when you push the neighbor. The first time you reach a cell is the
 * shortest time. Do not keep searching for a better one.
 *
 * [required] Multi-source: put every source in the queue at distance 0 before you start. That is
 * rotting oranges.
 *
 * [required] Shortest path in a binary matrix, 8 directions, or a 4-direction maze you prefer.
 * Hand-trace a 3×3.
 *
 * [required] A maze with a key you do not need yet. Plain shortest path first: hurdles are walls,
 * print the distance or -1.
 *
 * [required] Rotting oranges. Multi-source. If a fresh orange remains, the answer is -1.
 *
 * [stretch] 0-1 BFS only if you meet an edge of cost 0 or 1. Otherwise skip. A deque, push front
 * for 0 and back for 1.
 *
 * You are done when: The 3×3 hand distance matches, and a blocked start is handled the way the
 * statement says.
 *
 * Pitfalls:
 * - Using DFS for shortest path. DFS does not give distance when edges have equal cost.
 * - Allowing a move into a hurdle, or not counting the start as distance 0.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day38
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day38 {
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
