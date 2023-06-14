package edu.princeton.cs.src.strings;

import edu.princeton.cs.algs4.Alphabet;
import edu.princeton.cs.algs4.StdOut;

public class Count {

    public static void main(String[] args) {
        Alphabet alpha = new Alphabet();
        int R = alpha.radix();
        int [] count = new int[R];
        
        String s = "Hello, World!";
        int N = s.length();
        for(int i = 0; i < N; i++){
            if(alpha.contains(s.charAt(i)))
                count [alpha.toIndex(s.charAt(i))]++;
        for(int c = 0; c < R; c++){
            StdOut.print(alpha.toChar(c) + " " + count[c]);
        }
        }
    }
}
