package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CashbackHackerServiceTest {

    @Test
    public void testRemain() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 400;
        int actual = service.remain(600);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testZero() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 1000;
        int actual = service.remain(0);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testAbove1000() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 800;
        int actual = service.remain(1200);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test1000() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 1000;
        int actual = service.remain(1000);
        Assert.assertEquals(actual,expected);
    }
    @Test
    public void testUnderZero() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 1200;
        int actual = service.remain(-200);
        Assert.assertEquals(actual,expected);
    }
}