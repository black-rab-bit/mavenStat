package ru.netology.stat;

import ru.netology.stats.StatsService;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @org.junit.jupiter.api.Test
        //считаем сумму продаж
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 180;
        int actual = service.calculateSum(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //проверяем среднюю сумму продаж за год
    void shouldCalculateAverage() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 15;
        int actual = service.averageNumber(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //ищем последнее максимальное значение продаж за год
    void shouldCalculateMaxMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.lastMaxSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //ищем минимальное значение продаж за год
    void shouldCalculateMinMonth() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSalesMonth(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //ищем количество месяцев с суммой продаж ниже среднего за год
    void shouldCalculateLowMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThanAverageMonths(sales);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
        //ищем количество месяцев с суммой продаж выше среднего за год
    void shouldCalculateHighMonths() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected = 5;
        int actual = service.lessThanAverageMonths(sales);

        assertEquals(expected, actual);
    }
}