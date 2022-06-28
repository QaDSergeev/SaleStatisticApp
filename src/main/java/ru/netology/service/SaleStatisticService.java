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

        return numberMonthWithSalesByCriteria(sales, true);
    }

    public int numberMonthWithMinSales(int[] sales) {

        return numberMonthWithSalesByCriteria(sales, false);
    }

    public int countMonthWithSalesLessAverage(int[] sales) {

        return numberMonthWithCompareAverage(sales, false);
    }

    public int countMonthWithSalesGrateAverage(int[] sales) {

        return numberMonthWithCompareAverage(sales, true);
    }

    private int numberMonthWithSalesByCriteria(int[] sales, boolean isMax) {

        int numberMonth = 0;

        for (int index = 0; index < sales.length; index++) {

            if (isMax && sales[index] > sales[numberMonth] ||
                    !isMax && sales[index] <= sales[numberMonth]) {

                numberMonth = index;
            }
        }

        return numberMonth + 1;
    }

    private int numberMonthWithCompareAverage(int[] sales, boolean isGrate) {

        int mouthCount = 0;
        int averageSale = averageSalesAmount(sales);

        for (int sale : sales) {

            if (isGrate && sale >= averageSale ||
                    !isGrate && sale < averageSale) {

                mouthCount += 1;
            }
        }

        return mouthCount;
    }
}
