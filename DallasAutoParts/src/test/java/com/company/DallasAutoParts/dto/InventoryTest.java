package com.company.DallasAutoParts.dto;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;


public class InventoryTest {
    Inventory items;

    @Before
    public void setUp() {
        items = new Inventory();
    }


    @Test
    public void testGetStatus() {
        assertEquals(null,items.getStatus());


    }

}