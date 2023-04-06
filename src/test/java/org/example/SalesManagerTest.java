package org.example;

import org.junit.jupiter.api.*;
import org.example.SalesManager;

public class SalesManagerTest {

    private SalesManager salesManager;

    @BeforeEach
    void setUp() {
        salesManager = new SalesManager(new long[]{16,40,25,600,15});
        System.out.println("Before");
    }

    @AfterEach
    void tearDown() {
        System.out.println("After");
    }

    @BeforeAll
    static void setUpApp() {
        System.out.println("Before all tests");
    }

    @AfterAll
    static void tearDownAll() {
        System.out.println("After all tests");
    }

    @Test
    @DisplayName("Testing max")
    void salesMangerMax() {
        Assertions.assertEquals(600, salesManager.max());
    }

    @Test
    @DisplayName("Testing average")
    void salesManagerAverage() {
        Assertions.assertEquals(16, salesManager.average());
    }

    @Test
    @DisplayName("Equals long[]")
    void testCase() {
        long[] a = {16, 40, 25};
        long[] b = {16, 40, 25};
        Assertions.assertArrayEquals(a, b);
    }
}