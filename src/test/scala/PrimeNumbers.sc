import scala.collection.mutable.{ArrayBuffer, ListBuffer}

//val sieve = List.range(2,7000)
var primeCount =0
//
//
//def primes(list:List[Int]):Unit= {
//  if (list.isEmpty)println(primeCount)
//  else {
//    primeCount += 1
//    primes(list.filter(_ % list.head != 0))
//  }
//  primeCount
//}



var limit = 3000
var primeList:ArrayBuffer[Boolean] = ArrayBuffer.empty[Boolean]


//sieve method that takes less time but for some reason cant go above 3m
def calculatePrimesStream(end: Int): List[Int] = {
  val odds = Stream.from(3, 2).takeWhile(_ <= Math.sqrt(end).toInt)
  //creates a stream from 3, increases by 2 every time to create an endless loop of odd numbers until the max
  val composites = odds.flatMap(i => Stream.from(i * i, 2 * i).takeWhile(_ <= end))
  //creates a flat map of composite numbers by cancelling every multiple of i until end
  Stream.from(3, 2).takeWhile(_ <= end).diff(composites).toList
}
calculatePrimesStream(1000000000).length