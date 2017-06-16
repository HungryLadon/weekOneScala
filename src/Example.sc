

println("Hello World")

val string: String = "Ello Woorld"
print(string)

def Greeting(name:String): Unit ={
println("Hello "+ name)
}

Greeting("Alok")

def greetingTwo(name:String): String = {
  ("Hello " + name)
}
greetingTwo("Adamu")

def Print(value: Any)=println(value)
Print(5)
Print("ola")
Print(3.1415926562)
Print(0.989898)
var True = false
Print(True)

def String(word:String,value:Int):Unit={

println(word.substring(value))

}
String("hello",2)

def Strings2(string1:String,string2:String,char1:Char,char2:Char): Unit={

  val string3 = string1+string2
  val finalString = string3.replace(char1,char2)
  println(finalString)
}

Strings2("hellu","wurld",'u','o')

def sum(val1:Int,val2:Int):Int= {

   val1 + val2
}
sum(5,6)

def isSum(val1:Int,val2:Int,bool:Boolean):Int= {
  var sum : Int =0
  if(bool) {
     sum = val1 + val2
     sum
  }
  else{
    sum
  }

  }

isSum(1,2,true)
isSum(1,2,false)

def isSumZero(val1:Int,val2:Int):Int= {

  if(val1==0) val2
  else if(val2==0) val1
  else val1+val2
}
isSumZero(0,9)

def repeatString(string: String,value: Int):Unit={

  for(i<-0 to value-1) {
    println(string)
  }
}
repeatString("Hi",6)

def repeatChar(string: String,value: Int):Unit={
  for(i<-0 to value) {
    println(string*value)
  }
}

repeatChar("H",5)

def fizzBuzz(string: String,string2: String,int: Int):Unit={
  for(i<-1 to int){
    if(i%3==0) print(string+ " ")
    else if(i%5==0)print(string2 + " ")
    else{
      print(i+ " ")
    }

}

}
fizzBuzz("fizz","buzz",15)

def recursionOne(string:String,int: Int):Unit={
  if(int!=0){
    println(string)
    recursionOne(string, int - 1)
  }

}
recursionOne("Cnut",6)

def recursionTwo(string: String, int: Int,int2: Int):Unit={


  if(int2>0){
    println(string*int)
    recursionTwo(string ,int,int2 - 1)
  }


}
recursionTwo("boi",6,6)



def recursionFizzBuzz(string: String, string2: String, int:Int):Unit={

  if(int!=0) {
    if (int%5 == 0) {
      println(string)
    }
    else if (int%3 == 0) {
      println(string2)
    }
    else {
      println(int)
    }
    recursionFizzBuzz(string,string2,int-1)
  }
}
recursionFizzBuzz("Fizz","Buzz",15)


def patterMatching1(bool: Boolean,int: Int, int2:Int):Unit={
  var val1: Int = 0
  val1 = int+int2
  bool match {

    case true => println(val1)
    case false=>println(" ")
  }
}
patterMatching1(true,1,1)
patterMatching1(false,1,1)

def patternMatch2(int: Int, int2:Int):Unit={
  int match {

    case 0=> println(int2)
    case _=>int2 match{
      case 0=>println(int)
      case _=>println(int+int2)
    }
  }

}
patternMatch2(0,1)
patternMatch2(4,0)
patternMatch2(4,6)



val time: Array[String] = java.util.TimeZone.getAvailableIDs
val time2 = time.map(x=>x.split('/')).distinct

val parts = List("Engine","Tyres","Oil Change","Head Lights","Windscreen","Heater","Brakes","Fan belt","Wiper","Brake lights","Body work","")
var brokenParts:String = ""
val rand = scala.util.Random
def getParts(list: List[Any]):Unit={
  for(i<-0 to rand.nextInt(9)){
    brokenParts += parts(rand.nextInt(9))+","
  }
  println(brokenParts.toString)

}
getParts(parts)