fun main()
{
    print("Enter a number : ")
    var num = Integer.parseInt(readLine())

    if(num % 2 == 0)
    {
        println("$num is even.")
    }
    else
    {
        println("$num is odd.")
    }
}