fun main()
{
    print("Enter Month number : ")
    var M= Integer.parseInt(readLine())
    when(M){
        1->print("JAN")
        2->print("FEB")
        3->print("MAR")
        4->print("APR")
        5->print("MAY")
        6->print("JUN")
        7->print("JUL")
        8->print("AUG")
        9->print("SEP")
        10->print("OCT")
        11->print("NOV")
        12->print("DEC")
        else->print("Invalid month number!")
    }
}