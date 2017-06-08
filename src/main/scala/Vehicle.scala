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
  *
  *
  */
class Vehicle(var vehicleID:Int, var registration:String,var carType:String,var needsFix:Boolean,var fault:String ) {
  val faultList = Map(" "->0.00,"brakes"->4.00,"oil change"->5.00,"tyre change"->6.00,"Head lights"->10.00)



  def getVehicleID():Int = vehicleID
  def getRegistration():String = registration
  def getVehicleType():String = carType
  def getNeedsFix():Boolean = needsFix
  def getFault():String = fault

  def setCarType(carType : String){
    if(!(carType.matches(".*\\d+.*")))
      this.carType=carType
    else
      this.carType = "No Type"
  }

  def setNeedsFix(needsFix: Boolean): Unit ={
    this.needsFix = needsFix

  }
  def getFaults():Unit={
    val faults = fault.split(',')
    for(fault <-faults) {

      println(fault )
    }
  }


  def calculateBill(): Unit ={
    isCar()
    val faults = fault.split(',')
    var totalPrices:Double = 0.00
    for(fault<-faults){
       totalPrices += faultList(fault)
    }
    println(totalPrices)

  }

  def isCar():Unit={
    if(carType.equals("Car")){
      println("Please use calculateCarBill() instead")
      System.exit(1)
    }
    else {}


  }

  def fixVehicle(): Unit ={
    calculateBill()
    setNeedsFix(false)
  }

  override def toString = s"Vehicle($vehicleID, $registration, $carType, $needsFix, $fault)"
}
object Main{

  def  main(args: Array[String]): Unit ={
    val ferrari = new Vehicle(1,"xyz","MotorBike",true,"brakes,tyre change,oil change")
    println(ferrari.getVehicleType())
    ferrari.fixVehicle()
    println(ferrari.getNeedsFix())
    ferrari.getFaults()

  }

}