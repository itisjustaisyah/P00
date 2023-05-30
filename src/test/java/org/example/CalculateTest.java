package org.example;

import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class CalculateTest {

    @Test
    @DisplayName("Add two numbers")
    public void testAdd() {

        assertEquals(5555, new Calculate().add(4321, 1234));
    }

    @Test
    public void testMinus() {

        assertEquals(1111, new Calculate().minus(4444, 3333));
    }

    @Test
    public void testMultiple() {

        assertEquals(100, new Calculate().multiple(50, 2));
    }

    @Test
    public void testDevide() {
        assertEquals(2, new Calculate().devide(6, 3));
    }
}