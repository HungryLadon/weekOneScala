def BlackJack(int:Int, int2:Int):Unit ={
  val blackJackMap=Map("firstInt"->int,"secondInt"->int2)
  val map = blackJackMap.maxBy(_._2)//determines whats max by the second thing of the map
  var result: Int =0
  if(int <=21&&int2<=21 && int!=int2){
   result = map._2}//gets the second bit of the map.
  else {result = 0}
  print(result)
}

def UniqueSum(int: Int,int2:Int,int3:Int):Unit ={
  val numberList = List(int,int2,int3).distinct
  var result:Int = 0
  if(int==int2 && int2==int3) result
  else{
    result = numberList.sum
  }
  print(result)
}


BlackJack(12,12)
BlackJack(12,13)
BlackJack(22,12)


UniqueSum(1,1,1)
UniqueSum(1,2,3)
UniqueSum(3,1,3)
//