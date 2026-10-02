package com.codevita.week06;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 41 — Union-find
 * Week 6. Budget about 170 minutes.
 *
 * Merge sets and answer 'are they connected' almost in constant time.
 *
 * Why this is in the plan: Friend circles, merging accounts, and redundant cables are union-find.
 * You do not need the path if the question is only yes or no.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Parent array, find with compression, union by rank or size. Test: union(1,2),
 * union(2,3), connected(1,3) is true, connected(1,4) is false.
 *
 * [required] Components count starts at n and drops by one on a successful union of different
 * roots.
 *
 * [required] Number of provinces again, this time with union-find, same answer as BFS.
 *
 * [required] Redundant connection: the edge that connects two nodes already in the same set.
 *
 * [stretch] Accounts merge is the same structure with email strings as nodes. Do it only if the
 * first two are quick.
 *
 * You are done when: The four-node hand test passes, and provinces matches your BFS count on one
 * example.
 *
 * Pitfalls:
 * - Forgetting path compression and rank, then blaming yourself when a chain of 10^5 is slow. Add
 * both.
 * - Union of a node with itself should not drop the component count.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week06.Day41
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day41 {
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
