package edu.princeton.cs.src.sorting.elementarySort;

import static edu.princeton.cs.src.sorting.elementarySort.SortingTemplate.isSorted;
import static edu.princeton.cs.src.sorting.elementarySort.SortingTemplate.show;

public class ShellSort extends SortingTemplate {

    public static void sort(Comparable[] a) {
        int N = a.length;
        int h = 1;
        while (h < N / 3)
            h = 3 * h + 1;
        while (h >= 1) {
            for (int i = h; i < N; i++)
                for (int j = i; j >= h && less(a[j], a[j - h]); j -= h)
                    exch(a, j, j - h);
            h = h / 3;
        }
    }

    public static void main(String[] args) {
        String[] a = {"C", "B", "I", "V", "W", "Q"};
        System.out.print("initial array: ");
        show(a);
        sort(a);
        assert isSorted(a);
        System.out.print("sorted array: ");
        show(a);
    }
}
