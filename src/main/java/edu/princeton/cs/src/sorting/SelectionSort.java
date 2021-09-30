package edu.princeton.cs.src.sorting;

public class SelectionSort extends SortingTemplate{
    
    public static void sort(Comparable[] a) {
        int N = a.length;
        for (int i = 0; i < N; i++) {
            int min = i;
            for (int j = i + 1; j < N; j++)
                if(less(a[j], a[min])) min = j;
            exch(a, i, min);
        }
    }

        
    public static void main(String[] args) {
        String[] a = { "C", "B", "I", "V", "W", "Q" };
        System.out.print("initial array: ");
        show(a);
        sort(a);
        assert isSorted(a);
        System.out.print("sorted array: ");
        show(a);
    }
}
