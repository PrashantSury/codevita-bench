package com.codevita.template;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Functions worth retyping before a CodeVita round.
 * For modulus 1_000_000_007 a reduced multiply fits in a Java long.
 * Do not sieve toward 10^12. Do not use Math.pow for integer powers.
 */
public final class ContestTemplates {
    private ContestTemplates() {}

    public static boolean[] sieve(int n) {
        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true);
        if (n >= 0) {
            isPrime[0] = false;
        }
        if (n >= 1) {
            isPrime[1] = false;
        }
        for (int i = 2; (long) i * i <= n; i++) {
            if (!isPrime[i]) {
                continue;
            }
            for (int j = i * i; j <= n; j += i) {
                isPrime[j] = false;
            }
        }
        return isPrime;
    }

    public static List<Integer> primesUpTo(int n) {
        boolean[] isPrime = sieve(n);
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primes.add(i);
            }
        }
        return primes;
    }

    public static long gcd(long a, long b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            long t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    /** Divides before multiplying so the product does not overflow as easily. */
    public static long lcm(long a, long b) {
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a / gcd(a, b) * b);
    }

    public static long modpow(long a, long e, long m) {
        if (m == 1) {
            return 0;
        }
        long r = 1 % m;
        a %= m;
        if (a < 0) {
            a += m;
        }
        while (e > 0) {
            if ((e & 1L) == 1L) {
                r = r * a % m;
            }
            a = a * a % m;
            e >>= 1;
        }
        return r;
    }

    public interface Check {
        boolean ok(long mid);
    }

    /** First value in [lo, hi] for which check is true. check must be monotone. */
    public static long firstTrue(long lo, long hi, Check check) {
        while (lo < hi) {
            long mid = lo + (hi - lo) / 2;
            if (check.ok(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    /** 0/1 knapsack. Each row is {weight, value}. The capacity loop goes downward. */
    public static int knapsack(int[][] items, int cap) {
        int[] dp = new int[cap + 1];
        for (int[] item : items) {
            int w = item[0];
            int v = item[1];
            for (int c = cap; c >= w; c--) {
                dp[c] = Math.max(dp[c], dp[c - w] + v);
            }
        }
        return dp[cap];
    }

    /**
     * Shortest path on a 4-direction grid. '#' is blocked.
     * Visited is marked when a cell is pushed. A blocked start returns -1.
     */
    public static int bfs(char[][] grid, int sr, int sc, int tr, int tc) {
        if (grid[sr][sc] == '#') {
            return -1;
        }
        int rows = grid.length;
        int cols = grid[0].length;
        int[][] dist = new int[rows][cols];
        for (int[] row : dist) {
            Arrays.fill(row, -1);
        }
        ArrayDeque<int[]> queue = new ArrayDeque<>();
        dist[sr][sc] = 0;
        queue.add(new int[] {sr, sc});
        int[] dr = {1, -1, 0, 0};
        int[] dc = {0, 0, 1, -1};
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int r = cur[0];
            int c = cur[1];
            if (r == tr && c == tc) {
                return dist[r][c];
            }
            for (int k = 0; k < 4; k++) {
                int nr = r + dr[k];
                int nc = c + dc[k];
                if (nr < 0 || nc < 0 || nr >= rows || nc >= cols) {
                    continue;
                }
                if (grid[nr][nc] == '#' || dist[nr][nc] != -1) {
                    continue;
                }
                dist[nr][nc] = dist[r][c] + 1;
                queue.add(new int[] {nr, nc});
            }
        }
        return -1;
    }
}
