package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 40 — Cycles and topological order
 * Week 6. Budget about 180 minutes.
 *
 * Detect a cycle in a directed graph, and order tasks when every constraint is an edge.
 *
 * Why this is in the plan: Prerequisites, courses, and 'A must happen before B' are topological
 * order. A cycle means impossible.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Kahn's algorithm: indegree, queue of zeros, pop and reduce neighbors. If you visit
 * fewer than n nodes, there is a cycle.
 *
 * [required] Undirected cycle detection is a different algorithm. Only do it if you have time.
 * Directed is the one to finish.
 *
 * [required] Course schedule: return whether you can finish. This is cycle detection.
 *
 * [required] Course schedule II: return any valid order, or an empty answer if there is a cycle.
 * Test two independent nodes. Both orders are legal unless the problem wants one specific order.
 *
 * [stretch] A tiny undirected cycle check with DFS colors or parent pointers, on 4 nodes.
 *
 * You are done when: A 3-node cycle returns impossible, and a chain of 3 returns the only order.
 *
 * Pitfalls:
 * - Building the edge backwards. 'A before B' must be one consistent direction in your note.
 * - Forgetting a node with indegree 0 that is isolated. It still belongs in the order.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day40
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day40 {
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
