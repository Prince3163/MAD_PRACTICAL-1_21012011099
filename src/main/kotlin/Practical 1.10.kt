class car(var CI:String,var CO:String, var MD:Double, var OCP:Double, var CCP:Double){
    fun getCarInfo():String{
        return ("\nCar Information : $CI ")
    }

    fun getOriginalCarPrice():String{
        return ("\nOriginal Car Price : $OCP")
    }

    fun getCurrentCarPrice():String{
        return ("\nCurrent Car Price : ${CCP}CP")
    }

    fun displayInfo():String{
        return ("\nDisplay Info\n-----------------\nCar Information : $CI \nCar Owner : $CO \nMiles Drive : $MD \nOriginal Car Price : $OCP \nCurrent Car Price : $CCP")
    }
}

fun main(){
    var c=car("AUDI Q3 , 2017","Prince",2500.00,4000000.00,3500000.00)

    println(c.getCarInfo())
    println(c.getOriginalCarPrice())
    println(c.getCurrentCarPrice())
    println(c.displayInfo())
}