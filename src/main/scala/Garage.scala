



/**
  * Created by Administrator on 06/06/2017.
  */

class Garage(var isOpen:Boolean = false) {
  import scala.collection.mutable.ArrayBuffer
  var vehicleList = new ArrayBuffer[Vehicle]()


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
      if(vehicleList(i).vehicleType.equals(vehicleType)){
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

    val employee1 = new Employee("a","b",true,1)
    val ferrari = new Car("F33X334",true,"Tyres")
    val car = new Car("D33X4556",true,"Tyres")


    garage.addVehicle(ferrari)
    garage.addVehicle(car)
    employee1.fix(ferrari);employee1.fix(car)




    println(garage.vehicleList)


   // println(garage.vehicleList)
    //garage.emptyGarage()



    //println(garage.vehicleList(0).vehicleType)

    //garage.getVehicleByType("Car")
  }
}