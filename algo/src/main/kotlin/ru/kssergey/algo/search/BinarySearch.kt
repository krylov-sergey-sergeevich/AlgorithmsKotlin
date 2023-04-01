package ru.kssergey.algo.search

import lombok.extern.slf4j.Slf4j


@Slf4j
class BinarySearch {

    /**
     * Бинарный поиск в отсортированном массиве.
     * Сложность: O(log(n))
     *
     * @param arr массив элементов
     * @param searchElement искомый элемент
     * @return индекс элемента который ищем, если не найдем то будет -1
     */
    fun search(arr: List<Long>, searchElement: Long): Int {
        var left = 0
        var right = arr.size - 1

        while (left <= right) {
            val middle = (left + right) / 2
            if (arr[middle] < searchElement) {
                left = middle + 1
            } else if (arr[middle] > searchElement) {
                right = middle - 1
            } else {
                return middle
            }
        }
        return -1
    }

    /**
     * Поиск 'окна' для вставки элемента, если есть несколько равных то возвращаем первый индекс места.
     *
     * @param arr массив элементов
     * @param newElement элемент который мы хотим вставить
     * @return индекс места для вставки (с нуля считаем)
     */
    fun findSpot(arr: List<Long>, newElement: Long): Int {
        var left = 0
        var right = arr.size - 1

        while (left < right) {
            val middle = (left + right) / 2
            if (arr[middle] < newElement) {
                left = middle + 1
            } else {
                // Двигаем правую границу без -1 чтобы не упустить равные
                right = middle
            }
        }
        return left
    }
}