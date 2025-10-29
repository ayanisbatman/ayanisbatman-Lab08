package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        // Ensure both cities were added
        assertTrue(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));

        // Delete one city
        list.deleteCity(calgary);

        // Check that Calgary was deleted
        assertFalse(list.hasCity(calgary));

        // Edmonton should still exist
        assertTrue(list.hasCity(edmonton));
    }
}
