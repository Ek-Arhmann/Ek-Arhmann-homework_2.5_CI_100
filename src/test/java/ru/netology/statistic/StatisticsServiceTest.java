package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticsServiceTest {
  long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
  @Test
  void findMax() {
    StatisticsService service = new StatisticsService();

    long expected = 12;

    long actual = service.findMax(incomesInBillions);

    assertEquals(expected, actual);
  }
  @Test
  void findMin() {
    StatisticsService service = new StatisticsService();

    long expected = 3 ;

    long actual = service.findMin(incomesInBillions);

    assertEquals(expected, actual);
  }
}