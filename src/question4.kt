fun main() {
    var randomName=myName("John")
    print(randomName)

}
fun myName(name:String):String{
    if (name =="Shadya"){
        println("Thats Me!")
    }else{
        println("I dont know who that is")
    }
    return name

}