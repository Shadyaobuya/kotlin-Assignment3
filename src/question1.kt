fun main() {
    //Question 1
    name()


    //Question 2
    println(nameAge("Shadya", 22 ))

    //Question 3
    var text="Hello world"
        println(text.length)

    //Question 4
    var randomName=myName("Shadya")

    }


fun name(){
    var title="akirachix"
    print(title[0])
    print(title[2])
    println(title[3])
}

fun nameAge(name:String, age:Int):String{
    return "Hi my name is $name and I am $age years old"
}


fun myName(name:String):String{

    if (name =="Shadya"){
        println("Thats Me!")
    }else{
        println("I dont know who that is")
    }
    return name

}