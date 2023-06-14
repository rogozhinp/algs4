package edu.princeton.cs.src;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.Test;
 
/**
 *
 * @author progozhin
 * @date Nov 23, 2021
 */
public class BinarySearchTest {

    private int key;
    
    private int [] nums;

    @Test
    public void testBinarySearch() {
        key = 15;
        nums = new int [] {1, 2, 5, 6, 7, 15, 45, 67};
        assertEquals(5, BinarySearch.rank(key, nums));
    }

    @Test
    public void testSomeMethod() {
        key = 2;
        nums = new int [] {1, 2, 5, 6, 7, 15, 45, 67};
        assertEquals(1, BinarySearch.rank(key, nums));
    }
    
    @Test
    public void createBinarySearch() {
        BinarySearch s = new BinarySearch();
        assertNotNull(s);
    }
}