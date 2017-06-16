//Take sum between a and b
//Unit a>b this function keeps going and one a>b it will return 0.
//So the out put will look like
def sumInt(a:Int,b:Int):Int={
  if(a>b) 0 else a+ sumInt(a+1,b)

}
sumInt(1,5)

//sum of all cubes between a and b
//make a function that cubes, then apply it to the next function
def cube(a:Int):Int={
  a*a*a

}

def cubeInt(a:Int,b:Int):Int={
  if(a>b)0 else cube(a)+cubeInt((a+1),b)
}
cubeInt(1,3)
//(f is the parameter of the sum function, not a given function )
//a=>b is function type. It means that it take type a and returns type b
//f:Int=>Int means that f takes in type Int and returns type Int
def sum(f: Int=> Int,a:Int,b:Int):Int= {
  if (a > b) 0
  else f(a) + sum(f, a + 1, b)
}

def sumInts(a:Int, b:Int):Int={
  sum(id,a,b)

}
def sumCubes(a:Int,b:Int):Int={
  sum(cube,a,b)

}


def id(x:Int):Int={
  x
}

sumCubes(1,3)
sumInts(2,3)

val weekdays = List("Mon","Tue","Wed","Thu","Fri")
val x = for(day<-weekdays)yield //yield gives you back list
  {
    day match{
      case "Mon"=>"NOT ABOUT THAT LIFE"
      case otherDay=>otherDay
    }
  }
//until to stop at the end of the list
for(day<-weekdays){
    print(day+" ")
}
//pattern guard
for (day<-weekdays if day != "Mon"){
  println(day)
}
//nested for loops in Scala
for{i<-0 until 7
    day<- weekdays}
{
  println(s"$i, $day")
}

//example of a function
val getArea = (radius:Double)=>
{
  val PI=3.14
  PI*radius*radius

}:Double
//methods can only be inside a class
def getArea2 (radius:Double):Double={
  val PI=3.14
  PI*radius*radius

}
/***convert methods to functions*/
val r = 10
val PI = 3.14
def getCircleArea(r:Double):Double=PI*r*r

//val calcCircleArea = getCircleArea cant be done

//you need to specify which type the function return
val calCircleArea:(Double)=>Double = getCircleArea
calCircleArea(r)
//below takes in any value
val calCircleArea2 = getCircleArea _
/***First Class Functions*/
def getCircleStats(r:Double)={
  val PI = 3.14
  def getCircleArea(r:Double) = PI*r*r
  def getCircleCircumference(r:Double)=2*PI*r

  (getCircleArea(r),getCircleCircumference(r))
}
getCircleStats(10.00)

/**Higher order function
  * A function whose return value is a function
  * A function with a parameter that is a function
  * By name parameters and closures
  *
  *
  * */

val tuple = (1,4,5,6)
tuple._1

