package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 37 — BFS, DFS, and components
 * Week 6. Budget about 190 minutes.
 *
 * Traverse every reachable node exactly once, on graphs and on grids.
 *
 * Why this is in the plan: Connected rooms, caves, and islands are components. The order you visit
 * is not the answer unless the statement asks for a path.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] DFS and BFS both mark visited when you push or recurse, not when you pop. Otherwise
 * the same node enters the queue many times.
 *
 * [required] Components: loop every start node, and start a traversal only if it is unvisited. The
 * count of starts is the count of components.
 *
 * [required] Number of provinces, or connected components on your own edge list.
 *
 * [required] Number of islands again, now named as a graph problem.
 *
 * [required] Clone or copy is unnecessary. Instead: detect if a path exists from s to t. Return
 * yes or no. Test s = t.
 *
 * [stretch] Flood fill with 8 directions only if you change the delta list and retest a diagonal
 * case.
 *
 * You are done when: Visited-on-push is a comment in the template, and s = t returns reachable.
 *
 * Pitfalls:
 * - Marking visited on pop lets a node sit in the queue many times and can blow memory.
 * - Recursion depth on a long snake of 10^5 nodes can crash. Use an explicit stack or BFS for
 * large n.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day37
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day37 {
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
