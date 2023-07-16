package ru.otus.homework

fun main() {

    val numbers = mutableListOf(0)
    for(n in 1..99){
        numbers.add(n)
     }

    numbers.remove(0)
    numbers.retainAll { it % 2 != 0 }
    println(numbers)
    val numbers2 = numbers.slice(9..19)
    println(numbers2)
    println(numbers2.sumOf { it + 1 }) // 21

    val Persons = mutableListOf<Person>()
    Persons.add(Person("Ivan", "Ivanov", 23))
    Persons.add(Person("Alex", "Petrov", 20))
    Persons.add(Person("Test", "Testov", 25))
    Persons.add(Person("Alex", "Testov", 27))

    var Persons2 = sort1(Persons)

    Persons2.forEach {
            println("Name: ${it.name}; Surname: ${it.surname}; Age: ${it.age}")
        }
    var Persons3 = sort2(Persons)
            Persons3.forEach {
                println("Name: ${it.name}; Surname: ${it.surname}; Age: ${it.age}")
}
    val firstList = listOf(1, 4, 10, 5, 7)
    val mult2: (Int) -> Int = {it * 2}

    val time_ = math_WithList(firstList, mult2)

    println(time_)

}

fun math_WithList(List1: List<Int>, math: (Int) -> Int): Long {
    var startTime = System.currentTimeMillis()
    val newList = mutableListOf<Int>()
    for (i in List1) {
        newList.add(math(i))
    }
    Thread.sleep(1000)//доп. пауза, т.к. без неё возвращается 0 мс
    return System.currentTimeMillis() - startTime
}

fun sort1(persons: MutableList<Person>): MutableList<Person> {
    persons.sortByDescending { it.age }
    return persons
}

fun sort2(Persons: MutableList<Person>): MutableList<Person> {
      Persons.sortWith(
        compareBy(
            {it.name}, {it.surname}
        )
    )
    return Persons
}
