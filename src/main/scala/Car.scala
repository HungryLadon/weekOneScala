/**
  * Created by Administrator on 07/06/2017.
  */
 class Car(var carRegistration:String,private val carNeedsFix:Boolean, var faultyParts:String) extends Vehicle(carRegistration,"Car",carNeedsFix,faultyParts) {


  override val faultList = Map(" "->0.00,"brakes"->4.00,"Oil change"->5.00,"Tyre"->6.00,"Head lights"->10.00,"Engine"->20.00,"Heater"->40.00,"Body work"->50.00,"Fan Belt"->30.00,"Wiper"->40.00,"Windscreen"->30.00)
  override val faultFixTime = Map(" "->0.00,"brakes"->15.00,"Oil change"->20.00,"Tyre"->10.00,"Head lights"->20.00,"Engine"->60.00,"Heater"->30.00,"Body work"->35.00,"Fan Belt"->70.00,"Wiper"->20.00,"Windscreen"->20.00)

  override def toString = s"Car($id,$carRegistration, $needsFix, $faultyParts)"



  override  def getTimeToFix():Double={
    var totalTime:Double=0.00
    val partsToFix = faultyParts.split(',')
    for(parts<-partsToFix){
      totalTime+=faultFixTime(parts)
    }
    totalTime

  }

  override def calculateBill(): Double ={
    val faults = fault.split(',')
    var totalPrices:Double = 0.00
    for(partPrice<-faults){
      totalPrices += faultList(partPrice)
    }
    //println(totalPrices)
    totalPrices

  }
  override def fixVehicle(): Unit ={
    //calculateBill()
    setNeedsFix(false)

  }


}
object CarMain {




}