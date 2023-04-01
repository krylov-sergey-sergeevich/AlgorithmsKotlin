package ru.kssergey.algo

import lombok.extern.slf4j.Slf4j
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

@Slf4j
class ArraysTest {
    private val arraysAlgo = Arrays()

    @Test
    fun testArrayMaxElement() {
        assertEquals(10, arraysAlgo.getMaxElement(longArrayOf(1, 2, 3, 4, 5, 10)))
        assertEquals(0, arraysAlgo.getMaxElement(longArrayOf(-5, -3, -1, 0)))
    }

    @Test
    fun testFindMaxUnderBoundary() {
        assertEquals(4, arraysAlgo.findMaxUnderBoundary(longArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 5))
    }

    @Test
    fun testFindTopElements() {
        assertEquals(listOf<Long>(30, 20, 10), arraysAlgo.findTopElements(longArrayOf(1, 2, 3, 4, 10, 20, 30), 3))
    }
}