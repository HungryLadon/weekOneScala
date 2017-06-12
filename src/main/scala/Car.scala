/**
  * Created by Administrator on 07/06/2017.
  */
 class Car(var carRegistration:String,private val carNeedsFix:Boolean, var faultyParts:String) extends Vehicle(carRegistration,"Car",carNeedsFix,faultyParts) {


  val carParts = Map(" "->0.00, "Tyres"->4.00,"Exhaust"->5.00,"Windowscreen"->7.00,"Doors"->4.00)
  val carPartFixTime = Map (" "->0,"Tyres"->15,"Exhaust"->20,"Windowscreen"->25,"Doors"->60)

  override def toString = s"Car($id,$carRegistration, $needsFix, $faultyParts)"



  override  def getTimeToFix():Double={
    var totalTime:Double=0.00
    val partsToFix = faultyParts.split(',')
    for(parts<-partsToFix){
      totalTime+=carPartFixTime(parts)
    }
    totalTime

  }

  override def calculateBill(): Unit ={
    val faults = fault.split(',')
    var totalPrices:Double = 0.00
    for(partPrice<-faults){
      totalPrices += carParts(partPrice)
    }
    println(totalPrices)
  }
  override def fixVehicle(): Unit ={
    calculateBill()
    setNeedsFix(false)
  }


}
object CarMain {




}