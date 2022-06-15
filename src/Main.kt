fun main() {

    /* შეიყვანეთ (მინიჭება) X ცვლადის მნიშვნელობა (დამატება). */

    print("Enter first number: ")
    val x: Int = readLine()!!.toInt()

    /* შეიყვანეთ (მინიჭება) ცვლადის მნიშვნელობა (დამატება) Y */

    print("Enter second number: ")
    val y: Int = readLine()!!.toInt()

    /* გამოთვალეთ Z (Z = X + Y) */

    val z =  x + y

    /* აჩვენეთ მიმატების შედეგი, შეტყობინებით "X და Y ჯამი არის: */

    println("Result: $x + $y = $z")


    /*
        - დასვით შეკითხვა "გსურთ პროგრამის ხელახლა დაწყება <Y/N>?" და მიანიჭეთ მიღებული შედეგი ცვლადს ANSWER
        - თუ პასუხი არის „დიახ“, გადადით საფეხურზე 1
        - თუ პასუხი არის „არა“, გადადით მე-9 საფეხურზე
    */

    fun question() {
        print("გსურთ პროგრამის ხელახლა დაწყება <Y/N>?: ")
        val answer: String = readLine().toString().lowercase()

        if (answer == "y"){
            return main()
        }else if (answer != "n"){
            println("შეიყვანეთ Y ან N:")
            return question()
        }
    }

    question()


}