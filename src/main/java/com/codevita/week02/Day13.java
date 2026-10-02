package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 13 — Bits
 * Week 2. Budget about 160 minutes.
 *
 * Set, clear, test, and count bits, and use XOR when it is actually the model.
 *
 * Why this is in the plan: Bit problems are usually small and exact. They are not an excuse to
 * ignore the statement's examples.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Type: test bit i, set bit i, clear bit i, flip the lowest set bit with x & (x-1), and
 * count set bits. Test x = 0.
 *
 * [required] XOR facts you may use: x^x = 0, x^0 = x, and order does not matter. If a problem is
 * not about pairs canceling, do not force XOR.
 *
 * [required] Single Number: every element appears twice except one. Solve with XOR and also say
 * the hash-map solution and its memory.
 *
 * [required] Count set bits from 1 to n with a loop only if n ≤ 10^6. If you want the faster
 * identity, derive it for n < 16 on paper first.
 *
 * [required] Given a mask of allowed features as bits, enumerate all submasks of a mask whose
 * popcount is ≤ 20. Print the count and check a mask of 3 bits by hand.
 *
 * [stretch] Reverse the bits of a 32-bit word only if your language's shift rules are clear to
 * you.
 *
 * You are done when: Bit test, set, clear, and the submask count for a 3-bit mask match the hand
 * enumeration.
 *
 * Pitfalls:
 * - Signed right shifts and 32-bit versus 64-bit widths differ by language. Fix the width in the
 * problem, not in your habit.
 * - 1 << 31 in a 32-bit signed integer is undefined or negative. Use 1LL << k.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day13
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day13 {
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
