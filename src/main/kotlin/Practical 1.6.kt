fun main()
{
    print("1. Addition\n2. Substraction\n3. Multiplication\n4. Division\nChoose operation from above : ")
    var op=Integer.parseInt(readLine())
    print("Enter First number : ")
    var a=Integer.parseInt(readLine())
    print("Enter Second number : ")
    var b=Integer.parseInt(readLine())
    when (op)
    {
        1->print("Add")
        2->print("Sub")
        3->print("Mul")
        4->print("Div")
    }
}