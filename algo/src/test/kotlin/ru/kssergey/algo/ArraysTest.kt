package ru.kssergey.algo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/**
 * @author Krylov Sergey
 * @date  01.04.2023 15:50
 */
class ArraysTest {
    private val arraysAlgo = Arrays()

    @Test
    fun testArrayMaxElement() {
        assertEquals(10, arraysAlgo.getMaxElement(1, 2, 3, 4, 5, 10))
        assertEquals(0, arraysAlgo.getMaxElement(-5, -3, -1, 0))
    }
}