fun main()
{
    val a= arrayOf(1,11,21,31,41,51)
    print("Elements of first array : ")
    for(i in a)
    {
        print("$i ")
    }

    val b=Array<Int>(6){2}
    print("\nElements of second array : ")
    for(i in b)
    {
        print("$i ")
    }

    val c= Array<String>(6) {i -> "Element ${i+1}"}
    print("\nElements of Third array : ")
    for(i in c)
    {
        print("$i ")
    }

    val d=IntArray(6) {5}
    print("\nElements of Fourth array : ")
    for(i in d)
    {
        print("$i ")
    }

    val e= intArrayOf(5,10,15,20,25,30)
    print("\nElements of Fifth array : ")
    for(i in e)
    {
        print("$i ")
    }


}