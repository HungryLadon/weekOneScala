/**
  * Created by Administrator on 07/06/2017.
  */
class Car(var carID:Int, var carRegistration:String,var carNeedsFix:Boolean, var faultyParts:String) extends Vehicle(carID,carRegistration,"Car",carNeedsFix,faultyParts) {
  val carParts = Map(" "->0.00, "Tyres"->4.00,"Exhaust"->5.00,"Windowscreen"->7.00,"Doors"->4.00)

  val carPartFixTime = Map (" "->0,"Tyres"->15,"Exhaust"->20,"Windowscreen"->25,"Doors"->60)


  override def toString = s"Car($carID, $carRegistration, $carNeedsFix, $faultyParts)"



  def getTimeToFix():Unit={
    var totalTime:Double=0.00
    val partsToFix = faultyParts.split(',')
    for(parts<-partsToFix){
      totalTime+=carPartFixTime(parts)
    }
    println(totalTime)

  }

  def calculateCarBill(): Unit ={
    val faults = fault.split(',')
    var totalPrices:Double = 0.00
    for(partPrice<-faults){
      totalPrices += carParts(partPrice)
    }
    println(totalPrices)

  }


}
object CarMain {

  def main(args: Array[String]): Unit = {
    val car1 = new Car(1,"xxx",true,"Doors,Exhaust,Tyres")
    car1.getTimeToFix()


  }

}