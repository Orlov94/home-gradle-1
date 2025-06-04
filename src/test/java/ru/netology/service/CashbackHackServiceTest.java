package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldPurchaseLess1000() {

        int expected = 100;
        int actual = service.remain(900);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPurchaseOver1000() {
        int expected = 900;
        int actual = service.remain(1100);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldPurchase1000() {
        int expected = 0;
        int actual = service.remain(1000);

        assertEquals(expected, actual);
    }

}