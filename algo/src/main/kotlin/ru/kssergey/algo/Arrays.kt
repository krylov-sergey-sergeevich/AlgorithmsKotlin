package ru.kssergey.algo

class Arrays {

    /**
     * Нахождение максимального элемента в массиве.
     *
     * @param arr массив элементов
     * @return максимальное значение
     */
    fun getMaxElement(arr: LongArray): Long {
        var result = Long.MIN_VALUE
        for (el in arr) {
            result = maxOf(el, result)
        }
        return result
    }

    /**
     * Нахождение максимального элемента в массиве, который меньше topBoundary.
     *
     * @param arr массив элементов
     * @param topBoundary параметр ограничивающий максимальное значение
     * @return максимальное значение
     */
    fun findMaxUnderBoundary(arr: LongArray, topBoundary: Long): Long {
        var result = Long.MIN_VALUE
        for (el in arr) {
            if (el < topBoundary) {
                result = maxOf(el, result)
            }
        }
        return result
    }

    /**
     * Нахождение N максимальных элементов в массиве / Сортировка выбором.
     *
     * @param arr массив элементов
     * @param numberOfElements кол-во элементов
     * @return список максимальных элементов
     */
    fun findTopElements(arr: LongArray, numberOfElements: Int): List<Long> {
        val result = mutableListOf<Long>()

        var previousMax = Long.MAX_VALUE
        for (el in 1..numberOfElements) {
            val currentMax = findMaxUnderBoundary(arr, previousMax)
            result.add(currentMax)
            previousMax = currentMax
        }

        return result
    }
}