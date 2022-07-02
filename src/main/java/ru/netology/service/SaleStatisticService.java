package ru.netology.service;

public class SaleStatisticService {
    public int sumAllSales(int[] sales) {

        int sumSales = 0;

        for (int sale : sales) {

            sumSales += sale;
        }

        return sumSales;
    }

    public int averageSalesAmount(int[] sales) {

        return sumAllSales(sales) / sales.length;
    }

    public int numberMonthWithMaxSales(int[] sales) {

        int numberMonth = 0;

        for (int index = 0; index < sales.length; index++) {

            if (sales[index] >= sales[numberMonth]) {

                numberMonth = index;
            }
        }

        return numberMonth + 1;
    }

    public int numberMonthWithMinSales(int[] sales) {

        int numberMonth = 0;

        for (int index = 0; index < sales.length; index++) {

            if (sales[index] <= sales[numberMonth]) {

                numberMonth = index;
            }
        }

        return numberMonth + 1;
    }

    public int countMonthWithSalesLessAverage(int[] sales) {

        int mouthCount = 0;
        int averageSale = averageSalesAmount(sales);

        for (int sale : sales) {

            if (sale < averageSale) {

                mouthCount += 1;
            }
        }

        return mouthCount;
    }

    public int countMonthWithSalesGrateAverage(int[] sales) {

        int mouthCount = 0;
        int averageSale = averageSalesAmount(sales);

        for (int sale : sales) {

            if (sale > averageSale) {

                mouthCount += 1;
            }
        }

        return mouthCount;
    }
}
