package com.phoenix;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void testAdd() {
        assertEquals(8, App.add(5, 3));
    }

    @Test
    public void testAddNegative() {
        assertEquals(2, App.add(5, -3));
    }
}
