package ru.otus.homework


fun sumOfTwo(numbers: IntArray, target: Int): IntArray {

    val array: IntArray  = intArrayOf(0,0)

    var sum = 0
    var res = false
    var i = 0
    var isContains = false
    for  (fb in  numbers) {
        if  (sum == 0) {
            if  (fb < target) {
                //var isContains = numbers.contains(target-fb)
                for (k in i + 1..numbers.size - 1) {
                    if (target - fb  == numbers[k]) {
                        isContains = true
                        break
                    }
                }
                if  (isContains) {
                    array[0] = i
                    sum = fb
                }
            }
        }
        else {
            if  (sum + fb == target) {
                array[1] = i
                res = true
                break

            }

        }
        i++;
    }
    if  (res) {
        return array
    }
    else {
        throw IllegalArgumentException()
    }
}