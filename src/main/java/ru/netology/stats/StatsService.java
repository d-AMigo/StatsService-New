package ru.netology.stats;

public class StatsService {
    public int sumOfSales(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public double averageOfSales(int[] sales) {
        return sumOfSales(sales) / (double) sales.length;
    }

    public int findIndexOfMaxOfSales(int[] sales) {
        int currentMax = sales[0];
        int indexOfMonth = 0;
        int indexOfMaxMonth = 0;
        for (int sale : sales) {
            indexOfMonth++;
            if (currentMax <= sale) {
                currentMax = sale;
                indexOfMaxMonth = indexOfMonth;
            }
        }
        return indexOfMaxMonth;
    }

    public int findIndexOfMinOfSales(int[] sales) {
        int currentMin = sales[0];
        int indexOfMonth = 0;
        int indexOfMinMonth = 0;
        for (int sale : sales) {
            indexOfMonth++;
            if (currentMin >= sale) {
                currentMin = sale;
                indexOfMinMonth = indexOfMonth;
            }
        }
        return indexOfMinMonth;
    }

    public int amountOfMonthBelowAverage(int[] sales) {
        int countOfMonth = 0;
        int countOfBelowAverage = 0;
        double average = averageOfSales(sales);
        for (int sale : sales) {
            if (sale < average) {
                countOfMonth++;
                countOfBelowAverage = countOfMonth;
            }
        }
        return countOfBelowAverage;
    }

    public int amountOfMonthHighAverage(int[] sales) {
        int countOfMonth = 0;
        int countOfHighAverage = 0;
        double average = averageOfSales(sales);
        for (int sale : sales) {
            if (sale > average) {
                countOfMonth++;
                countOfHighAverage = countOfMonth;
            }
        }
        return countOfHighAverage;
    }
}