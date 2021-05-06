import java.util.*

fun main(){
introduction("Yvonne",23)
    serveDrinks(4)
    serveDrinks(10)
    serveDrinks(12)
    println(namesArray(arrayOf("Yvonne","Cate","Shadya")))


 var product=multiply(10 , 10)
    println(product)
    var result=divide(200,40)
    println(result)
    var remainder=modulus(50,30)
    println(remainder)
    var human=Humanbeing("Katama",24,45f)
    human.eat(3)
    human.speak("I love food")
    human.birthday()

    println(comparison(30,20))
println(names("mercy","Paul","john","tim","pesh"))


}
fun introduction(name:String,age:Int){
println("My name is $name amd I am $age years old.")
}
fun serveDrinks(age:Int) {
   if (age < 6) {
        println("serve a glass of milk")
    } else if (age < 15 && age > 6) {
        println("serve a bottle of fanta orange")
    } else {
        println("serve a bottle of cocacola")
    }
}
fun namesArray(names:Array<String>):Int {
    var count = 0
    for (name in names) {
        if (name.length > 4) {
            count++
        }

    }
    return  count
}
fun multiply(num1:Int,num2:Int):Int{
var multiply=num1*num2
    return multiply
}

fun divide(num1:Int,num2:Int):Int{
    var divide=num1/num2
    return divide
}
fun modulus (num1:Int,num2:Int):Int{
    var modulus= num1%num2
    return modulus

}
class Humanbeing(var name:String,var age:Int,var weight:Float) {
    fun eat(foodweight: Int){
        println("I am eating $foodweight kgs of food")
        weight += foodweight
        }
    fun speak(speech:String){
        println(speech)
    }
    fun birthday(){
        age += 1
    }
}

fun comparison(num1:Int,num2: Int):Int {

    if (num1 < num2) {

    }else{
        println("num2")
    }
    return num1
}

fun names(name1:String,name2:String,name3:String,name4:String,name5:String):Array<String>{
    return  arrayOf(name1,name2,name3,name4,name5)
}