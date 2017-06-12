

def Calculator(int: Int,int2: Int,int3: Int):Any={
  val list1 = List[Integer](int,int2,int3).sortWith(_<_)
      check(list1)
      println(list1(0) + "*" + list1(1) +"=" + list1(2))
      println(list1(2) + "/" + list1(1) +"=" + list1(0))
      println(list1(2) + "/" + list1(0) +"=" + list1(1))
  }
Calculator(7,14,98)
def check(list:List[Integer]): Any = {
  if ((list.head.toDouble*list(1).toDouble != list(2).toDouble)&&(list(2).toDouble/list(1).toDouble!=list.head.toDouble)&&
    (list(2).toDouble/list.head.toDouble != list(1)))
  {
    println("Wont work")
    System.exit(1)
  }
  else{}
}






