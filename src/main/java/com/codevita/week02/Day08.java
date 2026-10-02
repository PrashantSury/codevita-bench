package com.codevita.week02;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 8 — Primes and the sieve
 * Week 2. Budget about 180 minutes.
 *
 * Generate primes and answer prime questions up to the limit, not one by one.
 *
 * Why this is in the plan: Prime gaps, prime sums, and 'prime time' style counting show up as
 * medium problems, not trick questions.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Type the sieve of Eratosthenes to n. Mark multiples starting at i*i. Guard the i*i
 * overflow. Test n = 1, 2, and 10 against a hand list: 2, 3, 5, 7.
 *
 * [required] Also type trial division up to sqrt for a single number. Know which one you want:
 * many queries means sieve; one huge number means trial or factorisation.
 *
 * [required] Count primes strictly less than n.
 *
 * [required] Given a range [L, R] with R up to 10^6, print every prime in it using one sieve, not
 * a loop of trial divisions.
 *
 * [required] Consecutive prime sum: find the longest sum of consecutive primes that is itself
 * prime and does not exceed N. Sieve first, then prefix sums of the primes.
 *
 * [stretch] Smallest prime factor array, built during the sieve, and use it to factor one number.
 *
 * You are done when: The sieve is in your template file and matches the hand list through 30.
 *
 * Pitfalls:
 * - is_prime[1] must be false. This single bug creates fake primes.
 * - Sieve to 10^7 is fine. Sieve to 10^12 is not. Read the limit.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week02.Day08
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day08 {
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
