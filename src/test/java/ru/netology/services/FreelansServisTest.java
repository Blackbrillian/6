package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FreelansServisTest {
    @Test
    public void testCalculate1() {
        FreelansServis servis = new FreelansServis();
        int actual = servis.calculate(10000, 3000, 20000);
        int expenses = 3;

        Assertions.assertEquals(actual, expenses);
    }

    @Test
    public void testCalculate2() {
        FreelansServis servis = new FreelansServis();
        int actual = servis.calculate(100000, 60000, 150000);
        int expenses = 2;

        Assertions.assertEquals(actual, expenses);
    }
}