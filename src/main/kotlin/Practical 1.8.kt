fun main()
{
    val a= arrayOf(1,11,21,31,41,51)
    print("Elements of first array : ")

    for(i in a)
    {
        print("$i  ")
    }

    val b=Array<Int>(6){2}
    print("\nElements of second array : ")
    for(i in b)
    {
        print("$i  ")
    }

    val c= Array<String>(6) {i -> "Element ${i+1}"}
    print("\nElements of Third array : ")
    for(i in c)
    {
        print("$i  ")
    }

    val d=IntArray(6) {5}
    print("\nElements of Fourth array : ")
    for(i in d)
    {
        print("$i  ")
    }

    val e= intArrayOf(5,10,15,20,25,30)
    print("\nElements of Fifth array : ")
    for(i in e)
    {
        print("$i  ")
    }

    val f = arrayOf(intArrayOf(1,3), intArrayOf(4,5), intArrayOf(6,7))
    print("\nElements of Sixth array : ")
    for(i in f)
    {
        print(i.contentToString())
    }

    val arr = arrayOf(56,23,49,12,2)
    print("\n\nBefore sorting : ")
    for(i in arr){
        print("$i  ")
    }

    print("\nAfter sorting with Built-in fun: ")
    for(i in arr.sortedArray()){
        print("$i  ")
    }

    print("\nAfter sorting without using Built-in fun: ")
    for(i in arr.indices)
    {
        for (j in i+1 until arr.size)
        {
            if(arr[j]>arr[i]){
                var temp:Int=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }

    }
    for(i in arr.sortedArray()){
        print("$i  ")
    }

    
}