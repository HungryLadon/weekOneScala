
def Calculator(int: Int,int2: Int,int3: Int):AnyVal={
  val list = List(int,int2,int3).sortWith(_<_)
      println(list(0) + "*" + list(1) +"=" + list(2))
      println(list(2) + "/" + list(1) +"=" + list(0))
      println(list(2) + "/" + list(0) +"=" + list(1))

  }
Calculator(9,12,108)

def check(int1: Int,int2: Int,int3: Int):Int={





}



