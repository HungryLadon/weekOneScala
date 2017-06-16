/**
  * Created by Administrator on 06/06/2017.
  * person
  * employee
  * customer
  * vehicle
  * car
  * bike
  *
  * Must be able to add vehicle
  * Remove vehicle By Id ann Type
  * Fixing Vehicle(Boolean)
  * Calculating Cost of Repair(needs a fault)
  *
  *val parts = List("Engine","Tyres","Oil Change","Head Lights","Windscreen","Heater","Brakes","Fan belt","Wiper","Brake lights","Body work")
  *
  */
abstract class Vehicle(val registration:String,val vehicleType:String,var needsFix:Boolean,val fault:String) {
  val faultList = Map(" "->0.00,"brakes"->4.00,"oil change"->5.00,"Tyre"->6.00,"Head lights"->10.00,"Engine"->20.00,"Heater"->40.00,"Body work"->50.00,"Fan Belt"->30.00,"Wiper"->40.00)
  val faultFixTime = Map(" "->0.00,"brakes"->15.00,"oil change"->20.00,"Tyre"->10.00,"Head lights"->20.00,"Engine"->60.00,"Heater"->30.00,"Body work"->35.00,"Fan Belt"->70.00,"Wiper"->20.00)

  val id = Vehicle.nextID()


  def setNeedsFix(needFix: Boolean): Unit ={
    this.needsFix = needFix
  }

  def getFaults():Unit={
    val faults = fault.split(',').foreach(println)
  }

def getTimeToFix():Double={
    var totalTime:Double=0.00
    val partsToFix = fault.split(',')
    for(parts<-partsToFix){
      totalTime+=faultFixTime(parts)
    }
    totalTime

  }

  def calculateBill(): Double ={

    val faults = fault.split(',')
    var totalPrices:Double = 0.00
    for(fault<-faults){
      totalPrices += faultList(fault)
    }
    //println(totalPrices)
     totalPrices
  }



  def fixVehicle(): Unit ={
    //calculateBill()
    setNeedsFix(false)
  }

  override def toString = s"Vehicle($id,$registration, $vehicleType, $needsFix, $fault)"

}
object Vehicle{
  private var idSequence = 0

  private def nextID() ={
    idSequence+=1
    idSequence
  }






}