package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 10 — Modular arithmetic
 * Week 2. Budget about 180 minutes.
 *
 * Add, multiply, and exponentiate under a modulus without negative leftovers or overflow.
 *
 * Why this is in the plan: Large counts are printed modulo 10^9+7. A negative residue is a wrong
 * answer even when the math is right.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Normalize (a % m + m) % m so negatives become non-negative. Test a = −1.
 *
 * [required] Type modular exponentiation. Test 2^10 = 1024, and 2^10 mod 1000 = 24. Do not use
 * pow() on integers.
 *
 * [required] Remember: you can add and multiply mod m freely. You cannot divide unless you
 * multiply by a modular inverse, and only when the modulus is prime. If you do not need division
 * today, do not implement inverse.
 *
 * [required] Pow(x, n) for negative and positive n. For integers, negative n means a fraction.
 * Implement the integer cases the problem actually has.
 *
 * [required] Compute (a*b + c) mod m for a, b near 10^9 and m = 10^9+7 in your language. In C++
 * and Java, do not let the multiply overflow the type before the mod.
 *
 * [required] A small counting problem: number of ways to tile a 2×n board, printed mod 10^9+7.
 * This is Fibonacci in disguise. Derive it, do not memorize the name only.
 *
 * [stretch] If the modulus is prime and you needed a division, implement inverse via modpow(a,
 * m−2, m) once.
 *
 * You are done when: modpow is in the template and the three tests above match by hand.
 *
 * Pitfalls:
 * - In C++, a % m is negative when a is negative. Normalize.
 * - (a + b) % m is safe if a and b are already reduced and m fits, but a + b can still overflow a
 * 32-bit type. Use 64-bit.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day10
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day10 {
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
