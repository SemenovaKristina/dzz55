package ru.netology.stats;

public class StatsService {
    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }
    public int sumSales (long [] sales) {
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;
    }
    public int sumAverage (long [] sales){
        int sum = sumSales(sales);
        return sum / sales.length;
    }
    public int minAverage (long [] sales) {
        int minAverage = 0;
        int sum = sumAverage(sales);
        for (long sale : sales) {
            if (sale < sum) {
                minAverage++;
            }
        }
    return minAverage;
    }
    public int maxAverage (long [] sales) {
        int maxAverage = 0;
        int sum = sumAverage(sales);
        for (long sale : sales) {
            if (sale > sum) {
                maxAverage++;
            }
        }
        return maxAverage;
    }

}
