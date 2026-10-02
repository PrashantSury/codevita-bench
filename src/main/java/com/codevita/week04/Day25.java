package com.codevita.week04;

import com.codevita.template.FastScanner;
import java.io.IOException;

/**
 * Day 25 — Geometry by unfolding
 * Week 4. Budget about 180 minutes.
 *
 * Turn a surface path into a straight line on an unfolded net.
 *
 * Why this is in the plan: The portal's own samples include shortest paths on a cube and on a
 * cylinder. Do not invent 3D geometry in the contest. Unfold.
 *
 * Required work is marked [required]. Stretch work is optional.
 * Check a step off in your notes only after you typed it yourself.
 *
 * [required] Cylinder or cistern: cut the side into a rectangle of width equal to the
 * circumference and height equal to the height. The straight line to the target, or to the target
 * shifted by the circumference, is the candidate. Also consider going the other way. Minimum of
 * those lengths. Test a point directly above, where the answer is just the vertical distance.
 *
 * [required] Cube surface: unfold faces into a net so both points lie on one plane. The path must
 * cross faces that share edges. A straight line that cuts through a face not on the net is
 * illegal. For a contest problem, enumerate the few reasonable nets rather than a 3D formula.
 * Distance is Euclidean between a point and the image of the other point.
 *
 * [required] Keep coordinates and distances in floating point only at the end, or ask the
 * statement if it wants an integer. Rounding rules are part of the spec.
 *
 * [required] Implement the cylinder case with numbers you choose. Hand-compute 'directly above'
 * and 'halfway around'.
 *
 * [required] Two points on different faces of a cube of side 1. Try at least two unfoldings and
 * take the minimum legal segment. Draw the net on paper. The code only checks the drawing.
 *
 * [required] A non-path geometry drill: given points, compute the squared distance with integers
 * so you do not use sqrt until a comparison forces it.
 *
 * [stretch] Point in axis-aligned rectangle, inclusive boundaries. Off-by-one on the border is the
 * usual fail.
 *
 * You are done when: Cylinder 'directly above' matches the height, and you have a drawn cube net
 * with one measured segment.
 *
 * Pitfalls:
 * - sqrt comparison is unstable. Compare squared distances when you only need the nearer point.
 * - A path through the interior of the cube is not on the surface. If your line crosses a gap in
 * the net, discard it.
 *
 * Run: mvn -q exec:java -Dexec.mainClass=com.codevita.week04.Day25
 * CodeVita submissions use a public class named Main. Copy your solve() into Main when you
 * practice a full submit.
 */
public class Day25 {
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
