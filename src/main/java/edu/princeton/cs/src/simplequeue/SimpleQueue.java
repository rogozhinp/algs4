package edu.princeton.cs.src.simplequeue;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.Queue;

public class SimpleQueue {

    public static int[] readInts(String number) {
        In in = new In(number);
        Queue<Integer> q = new Queue<>();
        while(!in.isEmpty())
            q.enqueue(in.readInt());
        
        System.out.println("size: " + q.size());
        
        int N = q.size();
        
        int [] a = new int[N];
        
        for(int i = 0; i < N; i++)
           a[i] = q.dequeue();
        return a;
    }
}
