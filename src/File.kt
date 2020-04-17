fun main() {
    var array: Array<String>
    var q1: Int = 0
    var q2: Int = 0
    var q3: Int = 0
    var q4: Int = 0
    var q5: Int = 0
    var q6: Int = 0
    var q7: Int = 0
    var q8: Int = 0
    var q9: Int = 0
    var q0: Int = 0
    var size: Int = 0
    println("V vedite thisla: ")
    array = arrayOf(readLine().toString())

    while (array.size > size) {
        print()
    for (q in array) {
            for (w in q) {
                if (w == '1') {
                    q1++
                }
                if (w == '2') {
                    q2++
                }
                if (w == '3') {
                    q3++
                }
                if (w == '4') {
                    q4++
                }
                if (w == '5') {
                    q5++
                }
                if (w == '6') {
                    q6++
                }
                if (w == '7') {
                    q7++
                }
                if (w == '8') {
                    q8++
                }
                if (w == '9') {
                    q9++
                }
                if (w == '0') {
                    q0++
                }
            }
            size++
        }
    }
    if (q0 >= 1 || q1 >= 1 || q2 >= 1 || q3 >= 1 || q4 >= 1 || q5 >= 1 || q6 >= 1 || q7 >= 1 || q8 >= 1 || q9 >= 1) {

    }
   // println("В числе: $q есть такие цифры = Ноль: $q0  Первое: $q1  Второе: $q2  Третье: $q3  Четвертое: $q4  Пятное: $q5  Шестое: $q6  Седьмое: $q7  Восьмое: $q8  Девятое: $q9 ")
}



/*fun main() {
    var mas: Array<Int>
    var number: Array<Int>
    var i: Int = 0
    var pair: Pair<Int, Int>
    var mas1: Array<Int>
    while (i < 2) {
        println("Vvedite nomer: ")
        number = arrayOf(readLine()!!.toInt())
        println("Vvedite znachenie: ")
        mas = arrayOf(readLine()!!.toInt())
        for (q in mas) {
            for (w in number) {
                pair = w to q
                mas1 = arrayOf(pair.first, pair.second)
                mas1.sort(pair.first)
                println("Nomer: ${pair.first} Znachenie: ${pair.second}")
            }
        }
        i++
    }
}*/

/*fun main() {
    var mas1: Array<String>
    var mas2: Array<String>
    var q = 0
    while (q<3) {
        println("Vvedite nomer: ")
        mas1 = arrayOf(readLine().toString())
        println("Vvedite nomer: ")
        mas2 = arrayOf(readLine().toString())
        for (i in mas1) for (q in mas2) {
            val mixedList: List<Any> = Pair(i, q).toList()
            println(mixedList)
        }
        q++
    }
}*/

/*fun main() {
    var array: Array<String>
    var number: String
    println("Vvedite nomer: ")
    number = readLine()!!.toString()
    println("Vvedite znathenie: ")
    array = arrayOf(readLine().toString())
    for (i in array) {
        println(i[number.toInt()])
    }
}*/

/*
fun main() {
    var x: Int
    var y: Int
    var i: Int = 0
    var pair: Pair<Int, Int>
    while (i < 3) {
        x = readLine()!!.toInt()
        y = readLine()!!.toInt()
        pair = x to y
        println("Nomer: ${pair.first} Znachenie: ${pair.second}")
        i++
    }
}
*/




/*fun main() {
    var mas: Array<String>
    var quantity: Int = 0
    println("Vvedite chisla")
    mas = arrayOf(readLine().toString())
    for (i in mas){
        val str = i.split(" ").map { it.trim() }
        if (str.isNotEmpty()) {
            while (str.size > quantity) {
                for (i in str) {
                    for (i in i) {
                        var q: Int = i.toString().toInt()
                        if (q == 1) {

                        }
                    }
                }
            }
        }
    }
}*/


/*fun main() {
    val mas: Array<Int>
    val number: Int
    val sort: Int
    println("Введите номер массива: ")
    mas = arrayOf(readLine()!!.toInt())
    println("Введите значение массива: ")
    number = readLine()!!.toInt()
    for (i in number.toString()) {
        println(mas[i.toInt()].toString())
    }
    println()

}*/

/*fun main() {
    val mas: Array<String>
    var e: Int = 0
    var r: String = ""
    var t: Int = 0
    mas = arrayOf(readLine()!!.toString())
    for (i in mas) {
        val array = i.split(" ").map { it.trim() }
        while (array.size > e) {
            for (q in array[e]) {
                for (f in q.toString()) {
                    if (f == '1') {
                        t++
                    }
                }

                e++
            }
        }
        println(t.toString().length)
    }
}*/

/*fun main() {
    val mas: Array<String>
    var lengch0: Int = 0
    var lengch1: Int = 0
    var lengch2: Int = 0
    var lengch3: Int = 0
    var lengch4: Int = 0
    var lengch5: Int = 0
    var lengch6: Int = 0
    var lengch7: Int = 0
    var lengch8: Int = 0
    var lengch9: Int = 0
    var size0: Int = 0
    var size1: Int = 0
    var q: Int = 0
    var q1: Int = 0
    var p: Int = 0
    mas = arrayOf(readLine()!!.toString())
    for (i in mas) {
        val array = i.split(" ").map { it.trim() }
        for (i in array) {
            for (q in i) {
                if (q == '1') {
                    lengch0++
                }
                if (q == '2') {
                    lengch1++
                }
                if (q == '3') {
                    lengch2++
                }
                if (q == '4') {
                    lengch3++
                }
                if (q == '5') {
                    lengch4++
                }
                if (q == '6') {
                    lengch5++
                }
                if (q == '7') {
                    lengch6++
                }
                if (q == '8') {
                    lengch7++
                }
                if (q == '9') {
                    lengch8++
                }
                if (q == '0') {
                    lengch9++
                }

            }
        }

        if (lengch0 == 1) {
            while (array.size > q) {
                val v: Int = array.toString().length
                for (s in array[q]) {
                    if (s != '1') {
                        q++
                        size1++
                    } else {
                        break
                    }
                }
            }
            println(mas[q])
        }

        if (lengch1 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '2') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch2 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '3') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch3 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '4') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch4 == 1) {
            for (i in array) {
                for (s in array) {
                    if (s != "5") {
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch5 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '6') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch6 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '7') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch7 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '8') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch8 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '9') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }

        if (lengch9 == 1) {
            for (i in array) {
                for (s in array[q]) {
                    if (s != '0') {
                        q++
                        size1++
                    } else {
                        break
                    }

                }
            }
            val i: String = array[q]
            println(i)
        }
    }
}*/



