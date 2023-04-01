package ru.kssergey.algo.p700

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

/**
 * @author Krylov Sergey
 * @date  01.04.2023 17:11
 */
class BinarySearch704Test {
    private val solution = BinarySearch704.Solution()

    @Test
    fun search() {
        assertEquals(4, solution.search(intArrayOf(-1, 0, 3, 5, 9, 12), 9))
    }
}