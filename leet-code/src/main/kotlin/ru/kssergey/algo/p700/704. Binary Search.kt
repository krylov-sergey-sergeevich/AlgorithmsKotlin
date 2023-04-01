package ru.kssergey.algo.p700

/**
 * 704. Binary Search
 */
class BinarySearch704 {
    class Solution {
        fun search(nums: IntArray, target: Int): Int {
            var left = 0
            var right = nums.size - 1

            while (left <= right) {
                val middle = (left + right) / 2
                if (nums[middle] < target) {
                    left = middle + 1
                } else if (nums[middle] > target) {
                    right = middle - 1
                } else {
                    return middle
                }
            }
            return -1
        }
    }
}