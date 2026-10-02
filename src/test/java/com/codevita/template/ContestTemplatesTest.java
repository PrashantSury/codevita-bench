package com.codevita.template;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import org.junit.jupiter.api.Test;

class ContestTemplatesTest {
    @Test
    void sieveMatchesTheHandListThroughThirty() {
        List<Integer> primes = ContestTemplates.primesUpTo(30);
        assertEquals(List.of(2, 3, 5, 7, 11, 13, 17, 19, 23, 29), primes);
        assertEquals(false, ContestTemplates.sieve(10)[1]);
    }

    @Test
    void gcdAndLcm() {
        assertEquals(6, ContestTemplates.gcd(12, 18));
        assertEquals(36, ContestTemplates.lcm(12, 18));
        assertEquals(1, ContestTemplates.gcd(17, 5));
    }

    @Test
    void modpow() {
        assertEquals(24, ContestTemplates.modpow(2, 10, 1000));
        assertEquals(1024, ContestTemplates.modpow(2, 10, 1_000_000_007));
        assertEquals(0, ContestTemplates.modpow(-1, 1, 1));
    }

    @Test
    void firstTrueFindsSmallestSquareAtLeastTen() {
        long answer = ContestTemplates.firstTrue(0, 100, mid -> mid * mid >= 10);
        assertEquals(4, answer);
    }

    @Test
    void knapsackMatchesTheHandTable() {
        int[][] items = {{1, 1}, {2, 4}, {3, 6}};
        assertEquals(7, ContestTemplates.knapsack(items, 4));
    }

    @Test
    void bfsDistanceAndBlockedStart() {
        char[][] grid = {
            {'.', '#', '.'},
            {'.', '.', '.'},
            {'#', '.', '.'},
        };
        assertEquals(4, ContestTemplates.bfs(grid, 0, 0, 2, 2));
        assertEquals(-1, ContestTemplates.bfs(grid, 0, 1, 2, 2));
        assertEquals(0, ContestTemplates.bfs(grid, 1, 1, 1, 1));
    }
}
