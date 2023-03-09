fun main(){
    names("Grace","Wambui")
    numbers(arrayOf(45,78,29,7,101))
    myWords(arrayOf("boy","girl","woman","man"))

val calc = Calculator(98 ,80)
    calc.addition()
    calc.subtraction()
    calc.division()
    calc.multiplication()
}
//function that takes in two strings and prints the first character of the longer string or first character of the first string if equal in length
fun names(x:String ,y:String){
    if (x.length == y.length){
        println(x[0])

    }
    else if(x.length != y.length){
    println(y[0])
}

//function that takes in an array of integers and prints the following
fun numbers(num:Array<Int>):Int{
   var numb= num.min()
    return(numb)
    var numb1 = num.max()
    return (numb1)
    var numb2:Double = num.average()
    return (numb2)



}
//a function that takes in a string and splits it into all the characters that constitute it
fun word(name:String){
//    println(name.split())

}
//a function that takes in an array of strings and joins them into one string and returns it
fun myWords(x:Array<String>):String{
    return (x.contentToString())
}

//create a class
class Calculator(var x:Int, var y: Int){
    fun addition(){
        var add = x+y
        println(add)
    }
    fun subtraction(){
        var subtract = x-y
        println(subtract)
    }
    fun division(){
        var divide = x/y
        println(divide)
    }
    fun multiplication(){
        var multiply = x*y
        println(multiply)
    }

}
