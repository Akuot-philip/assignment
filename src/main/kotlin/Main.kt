fun main(){
    takeGreetings("Ada")
    getRemainder(30,7)
    sumNumber(40,50,60,70)
    interesting()

}
//quiz 1
fun takeGreetings(name:String){
    println("Hello $name")
}
//quiz 2
fun getRemainder(firstNum:Int,secondNum:Int):Int{
    var modulus = firstNum % secondNum
    println(modulus)
    return modulus
}
//quiz 3
fun sumNumber(firstNum: Int,secondNum: Int,thirdNum: Int,forthNum: Int):Int{
    var sum = firstNum + secondNum + thirdNum + forthNum
    println(sum)
    return sum
}
//quiz 4
fun interesting() {
    println("i love music and travelling")

}