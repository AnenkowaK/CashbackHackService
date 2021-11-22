package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn1000() {
        assertEquals(1000, service.remain(0));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(0, service.remain(1000));
    }

    @Test
    public void shouldReturn0() {
        assertEquals(service.remain(1000), 0);
    }

    @Test
    public void shouldReturn999() {
        assertEquals(999, service.remain(1001));
    }

    @Test
    public void shouldReturn500() {
        assertEquals(500, service.remain(10500));
    }
}