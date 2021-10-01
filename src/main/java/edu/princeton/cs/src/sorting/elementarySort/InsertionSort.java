package edu.princeton.cs.src.sorting.elementarySort;

import static edu.princeton.cs.src.sorting.elementarySort.SortingTemplate.isSorted;
import static edu.princeton.cs.src.sorting.elementarySort.SortingTemplate.show;

public class InsertionSort extends SortingTemplate {

    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 1; i < N; i++)
            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--)
                exch(a, j, j - 1);
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
