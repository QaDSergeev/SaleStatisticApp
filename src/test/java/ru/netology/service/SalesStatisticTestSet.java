package ru.netology.service;

import org.junit.jupiter.api.Test;
import ru.netology.service.SaleStatisticService;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SalesStatisticTestSet {

    @Test
    public void checkMaxSales(){

        int[] sales = { 2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 2 };
        int sumAllSales = SaleStatisticService.sumAllSales(sales);

        assertEquals(257, sumAllSales, "Сумма продаж " + sumAllSales + " посчитана не правильно !");
    }

    @Test
    public void checkAverageSalesAmount(){

        int[] sales = { 2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 2 };
        int averageSalesAmount = SaleStatisticService.averageSalesAmount(sales);

        assertEquals(21,  averageSalesAmount, "Средняя сумма продаж " + averageSalesAmount + " посчитана не правильно !");
    }

    @Test
    public void checkAverageSalesAmountIfItEquals(){

        int[] sales = { 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50, 50 };
        int averageSalesAmount = SaleStatisticService.averageSalesAmount(sales);

        assertEquals(50,  averageSalesAmount, "Средняя сумма продаж " + averageSalesAmount + " посчитана не правильно !");
    }

    @Test
    public void checkFirstMonthWithMinSales(){

        int[] sales = { 2, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3 };
        int monthWithMinSales = SaleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(1,  monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkMiddleMonthWithMinSales(){

        int[] sales = { 5, 50, 13, 35, 14, 10, 1, 15, 10, 35, 50, 3 };
        int monthWithMinSales = SaleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(7,  monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkLastMonthWithMinSales(){

        int[] sales = { 5, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3 };
        int monthWithMinSales = SaleStatisticService.numberMonthWithMinSales(sales);

        assertEquals(12,  monthWithMinSales, "Месяц с минимальными продажами " + monthWithMinSales + " посчитана не правильно !");
    }

    @Test
    public void checkFirstMonthWithMaxSales(){

        int[] sales = { 100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 3 };
        int monthWithMaxSales = SaleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(1,  monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkMiddleMonthWithMaxSales(){

        int[] sales = { 100, 50, 13, 35, 14, 200, 21, 15, 10, 35, 50, 150 };
        int monthWithMaxSales = SaleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(6,  monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkLastMonthWithMaxSales(){

        int[] sales = { 100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150 };
        int monthWithMaxSales = SaleStatisticService.numberMonthWithMaxSales(sales);

        assertEquals(12,  monthWithMaxSales, "Месяц с максимальными продажами " + monthWithMaxSales + " посчитана не правильно !");
    }

    @Test
    public void checkCountMonthWithLessAverage(){

        int[] sales = { 100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150 };
        int countMonthWithSalesLessAverage = SaleStatisticService.countMonthWithSalesLessAverage(sales);

        assertEquals(8, countMonthWithSalesLessAverage, "Число месяцев с продажами ниже среднего " + countMonthWithSalesLessAverage + " посчитана не правильно !");
    }

    @Test
    public void checkCountMonthWithGreatAverage(){

        int[] sales = { 100, 50, 13, 35, 14, 10, 21, 15, 10, 35, 50, 150 };
        int countMonthWithSalesGreatAverage = SaleStatisticService.countMonthWithSalesGrateAverage(sales);

        assertEquals(4, countMonthWithSalesGreatAverage, "Число месяцев с продажами выше среднего " + countMonthWithSalesGreatAverage + " посчитана не правильно !");
    }
}
