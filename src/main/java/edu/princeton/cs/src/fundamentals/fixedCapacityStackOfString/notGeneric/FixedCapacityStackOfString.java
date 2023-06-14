package edu.princeton.cs.src.fundamentals.fixedCapacityStackOfString.notGeneric;

public interface FixedCapacityStackOfString {

    void push(String item);
    String pop();
    boolean isEmpty();
    int size();
}
