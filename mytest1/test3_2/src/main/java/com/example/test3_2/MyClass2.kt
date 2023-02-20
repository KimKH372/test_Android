package com.example.test3_2

// 최고 상위 영역 : 선언과 동시에 초깃값 할당
val name = "kkh"
val name2:String = "kkh2"
val num1 = 10;

class MyClass2 {
    // 클래스 안 영역 , 선언과 동시에 초깃값 할당
    // var name4 =
    var name = "kkh3"
    var age = 40;
    val name2 = "kkh4"

}

fun main() {

    val data20 : Array<Int> = Array(3, {0})
    data20[0] = 10
    data20[1] = 20
    data20.set(2, 30)

    println(
        """
array size : $[data20.size}
array data : ${data20[0]}, ${data20[1]}, ${data20.get(2)}
            """
)

    fun some (data1: Int, data2: Int=10) : Int{
        return data1 * data2
    }
    println(some(data2 = 200, data1 = 100))

    fun  some() : Nothing? {
        throw Exception()
    }

    var n1 : Int?
    n1 = null

    var data15 : Nothing? = null

    var data12: Any = 10
    var data13: Any = "String"
    var data14: Any = MyClass2()

    fun test3() {
        println(data12)
        println(data13)
        println(data14)
    }

    var testxx = test3()
    println(testxx)

    fun addSum(no: Int):Int {
        var sum = 0
        for(i in 1..no){
            sum += i
        }
        return sum
    }
    val name = "yong"
    println("name, sum: ${addSum(10)}")

    val str1 = "hi \n yong"
    val str2 = """
	hi
	world
	"""
    println("str1: $str1")
    println("str2: $str2")

    var data1 :Int = 10

    data1 = data1 + 10
    data1 = data1.plus(10)

    // 함수 내부에서는 선언만 가능.
    var name10 : String
    // Myclass2 myclass2 = new Myclass();
    var myclass2 = MyClass2()
    // val 재할당 안 됨(var은 가능)
  //  myclass2.name2 ="kkh5"
    myclass2.name ="kkh5"
    val data4 = 10

    println("helloworld")
    println(123213)
    println(myclass2.name)
    println(myclass2.age)
    println(myclass2.name2)
    println("lazy 테스트 및 결괏값 재할당해서 연산 확인")
    println(data4 + 10)

}