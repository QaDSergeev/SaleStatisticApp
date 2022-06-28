package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.netology.service.SaleStatisticService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesStatisticTestSet {

    @Test
    public void checkMaxSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 2};
        int sumAllSales = saleStatisticService.sumAllSales(sales);

        assertEquals(257, sumAllSales, "Сумма продаж " + sumAllSales + " посчитана не правильно !");
    }

    @Test
    public void checkAverageSalesAmount() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 2};
        int averageSalesAmount = saleStatisticService.averageSalesAmount(sales);

        assertEquals(21, averageSalesAmount, "Средняя сумма продаж " + averageSalesAmount + " посчитана не правильно !");
    }

    @Test
    public void checkAverageSalesAmountIfItEquals() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50};
        int averageSalesAmount = saleStatisticService.averageSalesAmount(sales);

        assertEquals(50, averageSalesAmount, "Средняя сумма продаж " + averageSalesAmount + " посчитана не правильно !");
    }

    @Test
    public void checkFirstMonthWithMinSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3};
        int monthWithMinSales = saleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(1, monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkMiddleMonthWithMinSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {5, 50, 13, 35, 14, 10, 1, 15, 10, 35, 50, 3};
        int monthWithMinSales = saleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(7, monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkLastMonthWithMinSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {5, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3};
        int monthWithMinSales = saleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(12, monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkFirstMonthWithMaxSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3};
        int monthWithMaxSales = saleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(1, monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkMiddleMonthWithMaxSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {100, 50, 13, 35, 14, 200, 21, 15, 10, 35, 50, 150};
        int monthWithMaxSales = saleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(6, monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkLastMonthWithMaxSales() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150};
        int monthWithMaxSales = saleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(12, monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkCountMonthWithLessAverage() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150};
        int countMonthWithSalesLessAverage = saleStatisticService.countMonthWithSalesLessAverage(sales);

        assertEquals(8, countMonthWithSalesLessAverage, "Число месяцев с продажами ниже среднего " + countMonthWithSalesLessAverage + " посчитана не правильно !");
    }

    @Test
    public void checkCountMonthWithGreatAverage() {

        SaleStatisticService saleStatisticService = new SaleStatisticService();

        int[] sales = {100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150};
        int countMonthWithSalesGreatAverage = saleStatisticService.countMonthWithSalesGrateAverage(sales);

        assertEquals(4, countMonthWithSalesGreatAverage, "Число месяцев с продажами выше среднего " + countMonthWithSalesGreatAverage + " посчитана не правильно !");
    }
}
