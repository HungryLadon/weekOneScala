import java.lang.System
import java.util

/**
  * Created by Administrator on 06/06/2017.
  */


class Garage(var isOpen:Boolean = false) {
  import scala.collection.mutable.ArrayBuffer
  val vehicleList = new ArrayBuffer[Vehicle]()

  def addVehicle(vehicle: Vehicle): Unit = {
    check()
    vehicleList += vehicle


  }
  def emptyGarage():Unit ={
    check()
    vehicleList.clear()
    println("Garage is cleared")
  }
  def spit():Unit={
    check()
    for(i<-0 to vehicleList.length-1){

      println(vehicleList(i).toString)
    }
  }
  def Open():Unit={
    isOpen=true
  }
  def Close():Unit={
    isOpen=false
  }

  def getVehicleByType(vehicleType:String):Unit={
    check()
    for(i<-0 to vehicleList.length-1){
      if(vehicleList(i).getVehicleType().equals(vehicleType)){
        println(vehicleList(i).toString)
      }

    }
  }


  def check():Unit={
    if(isOpen==false){
      println("Closed. Thank You come again")
      System.exit(1)
    }
    else{}
  }




}
object garageMain {

  def main(args: Array[String]): Unit = {
    val garage = new Garage
    garage.Open()
    val ferrari = new Vehicle(1,"zxcvb","Car",true,"oil change,tyre change")
    val car1 = new Vehicle(2,"azxx","Car",true,"oil change,tyre change")
    val car2 = new Vehicle(3,"azxx","Car",true,"oil change,tyre change")
    val bike = new Motorbike(4,"aaaa",true,"tyre change")
    garage.addVehicle(car1)
    garage.addVehicle(car2)
    garage.addVehicle(bike)
    garage.addVehicle(ferrari)
    ferrari.calculateBill()
    //println(garage.vehicleList)
    //garage.emptyGarage()
    //println(garage.vehicleList)


    //println(garage.vehicleList(0).getVehicleType())
    garage.spit()
    //garage.getVehicleByType("Car")
  }
}