package org.example;

public class SalesManager {
    protected long[] sales;

    public SalesManager(long[] sales) {
        this.sales = sales;
    }

    public long max() {
        long max = -1;
        for (long sale : sales) {
            if (sale > max) {
                max = sale;
            }
        }
        return max;
    }

    public long min() {
        long min = sales[0];
        for (long sale : sales) {
            if (sale < min) {
                min = sale;
            }
        }
        return min;
    }

    public long average() {
        long average = 0;
        if (sales.length > 0) {
            long sum = 0;
            for (long sale : sales) {
                sum += sale;
            }
            average = (sum - max() - min()) / sales.length;
        }
        return average;
    }
}