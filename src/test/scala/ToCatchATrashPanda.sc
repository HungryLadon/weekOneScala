import scala.math.Numeric.IntIsIntegral

val string1:String = "Lelwhot"


//repeat the words at least once.
def getChar(string: String):String={
  var emp:String = ""
  val string2 = string.toCharArray
  for(s<-string2){
    emp += s+""+s

  }

    println(emp)
  emp
}
getChar("Lelwhot")

def getSandwich(string: String):Unit={
  if(string.toLowerCase.contains("bread"))
  {
    val int: Int = string.toLowerCase.indexOf("bread")
    val newS = string.substring(int + 5)

    if(string.toLowerCase.contains("bread")){
      val int2:Int=newS.toLowerCase.indexOf("bread")
      val newSt=newS.substring(int2-3,int2)
      println(newSt)
      }
    else println("")

  }

}
getSandwich("asasdBreadjamBread")


def getEven(int1: Int,int2: Int,int3: Int): Unit ={
  val list = List[Integer](int1,int2,int3).sortWith(_<_)
  //small-medium is same and medium-high is the same.
  if(list(0)-list(1)==list(1)-list(2)){
    println(true)
  }
  else{
    println(false)
  }

}
getEven(3,4,6)

import scala.collection.mutable.ArrayBuffer
var fib = new ArrayBuffer[Integer]()


def makeFibonacci(limit: Int): Unit ={//needs to be recurive
  fib+=0
  fib+=1
  if(fib.size==limit) {
    fib(limit)
  }
  else{
      for(i<-1 to limit)
      {
        fib+=fib(i)+fib(i-1)

      }
    println(fib(limit-1))
  }

}
makeFibonacci(8)

var totalEars:Int=0
def bunnyEars(int:Int):Int={
if(int!=0){
  totalEars += 2
  bunnyEars(int-1)
}
else{
totalEars
}
}
bunnyEars(1000)

def nTwice(string: String,int: Int):String={
  val s:String =string.substring(0,int)
  val t:String = string.substring(string.length-int)
  val u:String = s+t
  u

}
nTwice("chocolate",3)

def endsLy(string: String):Boolean={
  if(string.substring (string.length-2).equals(" ")) true
  else false

}
endsLy("truth")


var aString:String=""
import scala.collection.mutable.ArrayBuffer
var letters = new ArrayBuffer[String]()

def stringClean(string: String):String={
  letters+=string
  if(letters.isEmpty)aString
  else{
    aString+=compare(letters.head,letters(1))
    stringClean(string.tail)
  }


}
def compare(string1: String,string2: String):Unit={
  if(!string1.equals(string2))string2
  else{

  }
}
stringClean("aabbccc")
//string clean doesnt work atm, if i had more time i would basically turn the string in to char array and then
//compare the first index with index+1 and if they arent the same, I would add it to the aString and tail recurrsivly do it.