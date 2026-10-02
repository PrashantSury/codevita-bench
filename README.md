# CodeVita Bench (Java / Maven)

Eight weeks, 56 days, Java only. Use `BufferedReader` through `FastScanner`, not `Scanner`.

This is a Maven project. Group `com.codevita`, artifact `codevita-bench`, Java 17.
CodeVita itself may compile with an older JDK. The code here stays compatible with that: no records, no `var`, no preview features.

## Open it

```bash
mvn test
```

That runs the template tests (sieve, gcd, lcm, modpow, binary search on the answer, 0/1 knapsack, grid BFS). They should pass before you change them.

Run one day, after you replace `solve`:

```bash
mvn -q exec:java -Dexec.mainClass=com.codevita.week01.Day01
```

Import the folder as a Maven project in IntelliJ or Eclipse. Do not create the project from scratch and copy files in by hand.

## How a day works

Each `DayNN` class is the worksheet. The comment at the top is the assignment: required steps, the stop condition, and the usual wrong answer.
Fill in `solve`. A day is done only when that code is yours.

When you simulate a real submission, copy the solution into `src/main/java/Main.java`. CodeVita expects `public class Main`.

Templates live in `com.codevita.template.ContestTemplates`. On day 53, retype the ones you can defend. Delete any method you cannot rebuild.

## Weeks

### Week 1 — Make implementation boring

Round 1 is won by people who read the statement and ship a correct program.

- Day 1: The input contract (`com.codevita.week01.Day01`)
- Day 2: Constraints before code (`com.codevita.week01.Day02`)
- Day 3: Arrays, counts, prefixes (`com.codevita.week01.Day03`)
- Day 4: Strings as data (`com.codevita.week01.Day04`)
- Day 5: Sorting and a custom order (`com.codevita.week01.Day05`)
- Day 6: Two pointers and windows (`com.codevita.week01.Day06`)
- Day 7: Week 1 checkpoint (`com.codevita.week01.Day07`)

### Week 2 — Numbers you can trust

Primes, factors, digits, and modular arithmetic show up in every round.

- Day 8: Primes and the sieve (`com.codevita.week02.Day08`)
- Day 9: GCD, LCM, and factors (`com.codevita.week02.Day09`)
- Day 10: Modular arithmetic (`com.codevita.week02.Day10`)
- Day 11: Digits and constructed numbers (`com.codevita.week02.Day11`)
- Day 12: Counting (`com.codevita.week02.Day12`)
- Day 13: Bits (`com.codevita.week02.Day13`)
- Day 14: Week 2 checkpoint (`com.codevita.week02.Day14`)

### Week 3 — Search, greedy, and order

Binary search, greedy, and linear structures.

- Day 15: Binary search on a sorted array (`com.codevita.week03.Day15`)
- Day 16: Binary search on the answer (`com.codevita.week03.Day16`)
- Day 17: Greedy you can justify (`com.codevita.week03.Day17`)
- Day 18: Heaps (`com.codevita.week03.Day18`)
- Day 19: Sort, then scan (`com.codevita.week03.Day19`)
- Day 20: Stacks, queues, monotonic stacks (`com.codevita.week03.Day20`)
- Day 21: Week 3 checkpoint (`com.codevita.week03.Day21`)

### Week 4 — Story problems

Grids, surface geometry, and rule simulations.

- Day 22: Recursion and subsets (`com.codevita.week04.Day22`)
- Day 23: Backtracking that prunes (`com.codevita.week04.Day23`)
- Day 24: Grids and movement (`com.codevita.week04.Day24`)
- Day 25: Geometry by unfolding (`com.codevita.week04.Day25`)
- Day 26: Rule simulations (`com.codevita.week04.Day26`)
- Day 27: Edges and hand tests (`com.codevita.week04.Day27`)
- Day 28: Week 4 checkpoint (`com.codevita.week04.Day28`)

### Week 5 — Dynamic programming

State, transition, and base case before any loop.

- Day 29: One-dimensional DP (`com.codevita.week05.Day29`)
- Day 30: Knapsack (`com.codevita.week05.Day30`)
- Day 31: LIS and LCS (`com.codevita.week05.Day31`)
- Day 32: Grid DP (`com.codevita.week05.Day32`)
- Day 33: Subset sums and partitions (`com.codevita.week05.Day33`)
- Day 34: String DP (`com.codevita.week05.Day34`)
- Day 35: Rewrite the DP from blank (`com.codevita.week05.Day35`)

### Week 6 — Graphs

Components, unweighted shortest paths, Dijkstra, union-find.

- Day 36: How a graph is stored (`com.codevita.week06.Day36`)
- Day 37: BFS, DFS, and components (`com.codevita.week06.Day37`)
- Day 38: Shortest path without weights (`com.codevita.week06.Day38`)
- Day 39: Dijkstra (`com.codevita.week06.Day39`)
- Day 40: Cycles and topological order (`com.codevita.week06.Day40`)
- Day 41: Union-find (`com.codevita.week06.Day41`)
- Day 42: Week 6 checkpoint (`com.codevita.week06.Day42`)

### Week 7 — Archive problems and speed

Past CodeVita-style problems. No new topics.

- Day 43: Archive, set one (`com.codevita.week07.Day43`)
- Day 44: Archive, set two (`com.codevita.week07.Day44`)
- Day 45: Archive math (`com.codevita.week07.Day45`)
- Day 46: Qualifier mix (`com.codevita.week07.Day46`)
- Day 47: Repair the repeated miss (`com.codevita.week07.Day47`)
- Day 48: Three-hour timed set (`com.codevita.week07.Day48`)
- Day 49: Upsolve and post-mortem (`com.codevita.week07.Day49`)

### Week 8 — Full contest rehearsals

Two long mocks, then a template you can retype.

- Day 50: Full mock (`com.codevita.week08.Day50`)
- Day 51: Upsolve the mock (`com.codevita.week08.Day51`)
- Day 52: Second full mock (`com.codevita.week08.Day52`)
- Day 53: Rebuild the template (`com.codevita.week08.Day53`)
- Day 54: Speed without sloppiness (`com.codevita.week08.Day54`)
- Day 55: Light review (`com.codevita.week08.Day55`)
- Day 56: Short rehearsal or rest (`com.codevita.week08.Day56`)

## Contest reminders

- Allowed languages on the current portal include Java. Confirm the compiler after login.
- Do not assume a leading T unless the statement has one.
- Sums and products are `long`, not `int`.
- For modulus `1_000_000_007`, a multiply of two already-reduced values fits in a `long`.
- Save your file locally during the contest. The portal does not keep unsaved work.
