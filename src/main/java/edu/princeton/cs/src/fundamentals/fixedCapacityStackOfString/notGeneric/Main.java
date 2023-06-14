package edu.princeton.cs.src.fundamentals.fixedCapacityStackOfString.notGeneric;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Main {

    public static void main(String[] args) {
        FixedCapacityStackOfString s;
        s = new FixedCapacityStackOfStringImpl(100);
        
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if(!item.equals("-"))
                s.push(item);
            else if(!s.isEmpty()) StdOut.print(s.pop() + " ");
        }
        
        StdOut.println("(" + s.size() + " left on stack)");
    }
}
