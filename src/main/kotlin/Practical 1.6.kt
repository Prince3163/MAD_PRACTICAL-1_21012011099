
fun add(x:Int ,y:Int) : Int{
    return x+y;
}
fun sub(x:Int ,y:Int) : Int{
    return x-y;
}
fun mul(x:Int ,y:Int) : Int{
    return x*y;
}
fun div(x:Int ,y:Int) : Int{
    return x/y;
}
fun main()
{
    print("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\nChoose one operation from above : ")
    var op=Integer.parseInt(readLine())
    print("Enter First number : ")
    var a=Integer.parseInt(readLine())
    print("Enter Second number : ")
    var b=Integer.parseInt(readLine())
    when (op)
    {
        1->print("$a + $b = "+add(a,b))
        2->print("$a - $b = "+sub(a,b))
        3->print("$a * $b = "+mul(a,b))
        4->print("$a / $b = "+div(a,b))
        else->print("Invalid Operation!")
    }
}