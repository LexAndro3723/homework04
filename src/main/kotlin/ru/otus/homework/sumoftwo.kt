package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    var i = 0

    for (fb in numbers) {
        if (fb < target) {
            for (k in i + 1..numbers.size - 1) {
                if (target - fb == numbers[k]) {
                    return intArrayOf(i, k)
                }
            }
        }

        i++
    }
    throw IllegalArgumentException()

}