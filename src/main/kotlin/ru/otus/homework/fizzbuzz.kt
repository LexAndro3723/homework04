package ru.otus.homework

fun fizzbuzz(n: Int): Array<String> {
    val Array = Array(n, {0})
    val Array2 = Array(n, {""})

    for(n1 in 0..n-1){
        Array[n1] = n1
    }

    var i = 0
    for  (fb in Array) {
        if  (fb == 0 || fb % 3 == 0 && fb % 5 == 0) {
            Array2[i] = "FizzBuzz"
        }else if (fb % 3 == 0){
            Array2[i] = "Fizz"
        } else if (fb % 5 == 0){
            Array2[i] = "Buzz"
        }
        else {
            Array2[i] = fb.toString()
        }
        i++;
    }
    return Array2
}