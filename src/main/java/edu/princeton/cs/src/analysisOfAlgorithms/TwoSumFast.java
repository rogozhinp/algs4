package edu.princeton.cs.src.analysisOfAlgorithms;

import edu.princeton.cs.algs4.BinarySearch;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class TwoSumFast {

    public static int count(int[] a) {
        Arrays.sort(a);
        int N = a.length;
        int cnt = 0;
        for (int i = 0; i < N; i++)
            if (BinarySearch.rank(-a[i], a) > i)
                cnt++;
        return cnt;
    }
    
    public static void main(String[] args) {
        int[] a = {12, 23, 34, 45, 56, -12};
        StdOut.println(count(a));
    }
}
