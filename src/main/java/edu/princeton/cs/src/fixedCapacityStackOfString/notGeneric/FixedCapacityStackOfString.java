package edu.princeton.cs.src.fixedCapacityStackOfString.notGeneric;

public interface FixedCapacityStackOfString {

    void push(String item);
    String pop();
    boolean isEmpty();
    int size();
}
