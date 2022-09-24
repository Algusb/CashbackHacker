package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackerServiceTest {

    @Test
    void remain() {
        CashbackHackerService service = new CashbackHackerService();
        int expected = 200;
        int actual = service.remain(800);
        Assertions.assertEquals(expected, actual);
    }
}