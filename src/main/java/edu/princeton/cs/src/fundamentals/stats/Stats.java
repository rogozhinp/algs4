package edu.princeton.cs.src.fundamentals.stats;

import edu.princeton.cs.algs4.Bag;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Stats {

    public static void main(String[] args) {
        System.out.println("start algorithm");
        Bag<Double> numbers = new Bag<>();
//        List<Double> numbers = new ArrayList<>();
        System.out.println("collection created");
        while (!StdIn.isEmpty()) {
            System.out.println("in while");
            numbers.add(StdIn.readDouble());
            System.out.println("number size: " + numbers.size());
        }
        int N = numbers.size();
        System.out.println("size " + N);

        double sum = 0.0;
        for (double x : numbers) {
            sum += x;
        }
        double mean = sum / N;

        sum = 0.0;
        for (double x : numbers) {
            sum += (x - mean) * (x - mean);
        }
        double std = Math.sqrt(sum / (N - 1));

        StdOut.printf("Mean: %.2f\n", mean);
        StdOut.printf("Std dev: %.2f\n", std);
    }
}
