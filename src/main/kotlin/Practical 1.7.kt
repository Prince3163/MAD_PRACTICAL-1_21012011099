fun main() {
    //val number = 5
    print("Enter a number : ")
    val number = readLine()?.toIntOrNull();

    if (number != null) {
        val factorial = Fact(number)
        println("Factorial of $number = $factorial .")

        val tailrecFactorial = tailrecFact(number)
        println("By Tailrec keyword, Factorial of $number = $tailrecFactorial .")
    }
    else{
        println("Invalid Number!")
    }
}

fun Fact(n:Int):Int {
    return if(n==1)
    {
        1
    }
    else{
        n*Fact(n-1)
    }
}

tailrec fun tailrecFact(n: Int, temp: Int = 1): Int {
    return if (n == 1){
        temp
    } else {
        tailrecFact(n-1, temp*n)
    }
}