package edu.princeton.cs.src.fixedCapacityStackOfString.notGeneric;

public class FixedCapacityStackOfStringImpl implements FixedCapacityStackOfString{
    
    private String[] a;
    private int N;

    public FixedCapacityStackOfStringImpl(int cap) {
        a = new String[cap];
    }
    
    
          

    @Override
    public void push(String item) {
        a[N++] = item;
    }

    @Override
    public String pop() {
        return a[--N];
    }

    @Override
    public boolean isEmpty() {
        return N == 0;
    }

    @Override
    public int size() {
        return N;
    }


}
