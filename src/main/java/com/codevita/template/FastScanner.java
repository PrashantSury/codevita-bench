package com.codevita.template;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Token reader for contest input. Prefer this over Scanner.
 * Do not mix next() and nextLine() on the same line of input.
 */
public final class FastScanner {
    private final BufferedReader reader;
    private StringTokenizer tokens = new StringTokenizer("");

    public FastScanner(InputStream in) {
        this.reader = new BufferedReader(new InputStreamReader(in));
    }

    public String next() throws IOException {
        while (!tokens.hasMoreTokens()) {
            String line = reader.readLine();
            if (line == null) {
                return null;
            }
            tokens = new StringTokenizer(line);
        }
        return tokens.nextToken();
    }

    public int nextInt() throws IOException {
        return Integer.parseInt(next());
    }

    public long nextLong() throws IOException {
        return Long.parseLong(next());
    }

    /** A whole line, including spaces. Not for use after a partial next() on that line. */
    public String nextLine() throws IOException {
        return reader.readLine();
    }
}
