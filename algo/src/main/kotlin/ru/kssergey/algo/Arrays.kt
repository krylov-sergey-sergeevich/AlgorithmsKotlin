package ru.kssergey.algo

class Arrays {

    /**
     * Нахождение максимального элемента в массиве.
     *
     * @param arr массив элементов
     * @return максимальное значение
     */
    fun getMaxElement(vararg arr: Long): Long {
        var result = arr[0]
        for (el in arr) {
            result = maxOf(el, result)
        }
        return result
    }
}