import scala.collection.mutable.ArrayBuffer
import scala.io.Source

val path = "C:\\Users\\Administrator\\Desktop\\something.txt"
//var arrString = ArrayBuffer[String]
val lines = Source.fromFile("C:\\Users\\Administrator\\Desktop\\something.txt").getLines.toArray


def sortString(string: String): String = {
  string.toLowerCase.sorted

}






for(s<-lines){
  println(sortString(s.trim))

}




