package com.rydzwr.descending_order_on_pc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DescendingOrderTests
{
    @Test
    public void test_01()
    {
        assertEquals(0, DescendingOrder.sortDesc(0));
    }

    @Test
    public void test_02()
    {
        assertEquals(51, DescendingOrder.sortDesc(15));
    }

    @Test
    public void test_03()
    {
        assertEquals(987654321, DescendingOrder.sortDesc(123456789));
    }
}
