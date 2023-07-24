//
class student(var enno:Int , var name:String) :people()
{
    constructor():this(enno=99,name="Prince")
    {

    }
}
open class people()
{
    var city="Mehsana"
    var zip="123456"
}
fun main()
{
    var s1 = student(56,"hgfg")
    print("Enrollment : "+s1.enno+"\nName : "+s1.name)
    print("\nCity : "+s1.city+"\nZip code : "+s1.zip)
}