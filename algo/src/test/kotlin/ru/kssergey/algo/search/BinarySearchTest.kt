package ru.kssergey.algo.search

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BinarySearchTest {
    private val binarySearch = BinarySearch()

    @Test
    fun testSearch() {
        val arr = listOf<Long>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        assertEquals(4, binarySearch.search(arr, 5))
        assertEquals(-1, binarySearch.search(arr, 11))
    }

    @Test
    fun testFindSpot() {
        val arr = listOf<Long>(1100, 1200, 1600, 1600, 1600, 3000, 4000)
        assertEquals(0, binarySearch.findSpot(arr, 1000))
        assertEquals(1, binarySearch.findSpot(arr, 1150))
        assertEquals(2, binarySearch.findSpot(arr, 1600))
        assertEquals(5, binarySearch.findSpot(arr, 1700))
    }
}