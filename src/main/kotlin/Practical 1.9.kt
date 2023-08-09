fun main() {
    var arr= arrayOf(50,20,10,6,99,7)
    var max=arr[0]

    for(i in arr.indices)
    {
        if(arr[i]>max)
        {
            max=arr[i]
        }
    }
    print("Array : ")
    for(i in arr){
        print("$i  ")
    }
    print("\nMaximum element from above array is $max.")
}