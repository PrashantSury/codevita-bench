package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 36 — How a graph is stored
 * Week 6. Budget about 160 minutes.
 *
 * Build an adjacency list from an edge list, including undirected edges and 1-index input.
 *
 * Why this is in the plan: The story will not say 'graph'. Caves, cities, and friendships are
 * graphs. Storage comes before the algorithm.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] From edges (u,v), build a list of lists. If undirected, push both ways. If the input
 * is 1-indexed, convert once at the edge, not inside BFS.
 *
 * [required] Know the memory: a matrix is n^2. At n = 10^5 you must use lists. At n ≤ 500 a matrix
 * is comfortable and sometimes simpler.
 *
 * [required] Read n, m, then m edges, and print the neighbors of each node in a stable order you
 * define.
 *
 * [required] Build the same graph as a matrix for n ≤ 8 and check the list against the matrix.
 *
 * [stretch] Weighted edges stored as pairs. Do not run Dijkstra yet.
 *
 * You are done when: An undirected 1-indexed sample prints the same neighbors you wrote by hand.
 *
 * Pitfalls:
 * - Pushing an undirected edge only one way. Half the graph disappears.
 * - Using node numbers as indexes without converting 1-index input. Node n then writes past the
 * end.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day36
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day36 {
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
