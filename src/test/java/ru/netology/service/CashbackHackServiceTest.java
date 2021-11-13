package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000() {
        assertEquals(service.remain(0), 1000);
    }

    @Test
    public void shouldReturn0() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldReturn999() {
        assertEquals(service.remain(1001), 999);
    }

    @Test
    public void shouldReturn500() {
        assertEquals(service.remain(10500), 500);
    }
}