package edu.princeton.cs.algs4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphTest {

    private Graph graph;

    @Test
    void test() {
        graph = new Graph(5);
        System.out.println(graph);
    }
}