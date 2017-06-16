import scala.concurrent.Future


/**
  * Created by Administrator on 06/06/2017.
  */

class Garage(var isOpen:Boolean = false) {
  import scala.collection.mutable.ArrayBuffer
  var vehicleList = new ArrayBuffer[Vehicle]()
  var employeeList = new ArrayBuffer[Employee]()
  var profit = 0.00
  var totalTimeTaken=0.00




  def getFreeEmployee(employeeList:ArrayBuffer[Employee]):ArrayBuffer[Employee]={
    employeeList.filter(_.isFree==true)

  }

  def addVehicle(vehicle: Vehicle): Unit = {
    check()
    vehicleList += vehicle
  }

  def addEmployee(employee: Employee): Unit = {
    check()
    employeeList += employee
  }
  def emptyGarage():Unit ={
    check()
    vehicleList.clear()
    println("Garage is cleared")
  }
  def spit():Unit={

    for(i<-0 until vehicleList.length-1){

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
    vehicleList.filter(_.vehicleType==vehicleType)
  }

  def fixGarage():Unit={
   recurse(vehicleList,employeeList)
    getProfit()
  }
  def setTrue(list:ArrayBuffer[Employee]):Unit={
    for(e<-list){

    e.isFree=true

    }
  }


  def recurse(vehicleList: ArrayBuffer[Vehicle],employeelist:ArrayBuffer[Employee]): Unit ={

    if(vehicleList.size!=0){
      if(employeelist.nonEmpty && employeelist.head.isFree){

        employeelist.head.fix(vehicleList.head)
        profit+=vehicleList.head.calculateBill()
        totalTimeTaken+=vehicleList.head.getTimeToFix()
        removeVehicle(vehicleList.head)

        recurse(vehicleList,employeelist.tail)
        }
      else{
        println("Waiting for a free employee...")
        setTrue(employeelist)
        Thread.sleep(3000)

        recurse(vehicleList,employeeList)
      }
    }
    else {
      //employeeList.head.fix(vehicleList.head)
      println("Repair Finished")
      println("Total Profit = £" + profit)
      println("Total Time Taken = " + totalTimeTaken + " Minutes")
    }

  }

  def getProfit():Unit={
    var temp:Double=0.0
    for(vehicle<-vehicleList){
      temp += vehicle.calculateBill()
    }
    println(temp)
  }

  def check():Unit={
    if(isOpen==false){
      println("Closed. Thank You come again")
      System.exit(1)
    }
    else{}
  }



  def removeVehicle(vehicle: Vehicle):Unit={
    vehicleList-=vehicle

  }


}


object garageMain {

  val parts = List("Engine","Tyre","Oil change","Head lights","Windscreen","Heater","brakes","Fan Belt","Wiper","Brake lights","Body work"," ")
  var brokenParts:String = ""
  var rand = scala.util.Random
  var loop:Int=rand.nextInt(9)

  def getParts(list: List[Any]):String={
    brokenParts=""
    for (i<-0 to loop){
      brokenParts += parts(rand.nextInt(9))+","
    }
    brokenParts.toString
  }


  def main(args: Array[String]): Unit = {
    val garage = new Garage
    garage.Open()

    val employee1 = new Employee("a","b",true)
    val employee2 = new Employee("c","d",true)
    val employee3 = new Employee("e","f",true)
    val employee4 = new Employee("g","h",true)
    val ferrari = new Car("F1",true,getParts(parts))
    val car1 = new Car("C1",true,getParts(parts))
    val car2= new Car("C2",true,getParts(parts))
    val car3 = new Car("C3",true,getParts(parts))
    val car4 = new Car("C4",true,getParts(parts))
    val car5 = new Car("C5",true,getParts(parts))
    val car6 = new Car("C6",true,getParts(parts))


    garage.addEmployee(employee1)
    garage.addEmployee(employee2)
    garage.addEmployee(employee3)
    garage.addEmployee(employee4)

    garage.addVehicle(ferrari)
    garage.addVehicle(car1)
    garage.addVehicle(car3)
    garage.addVehicle(car4)
    garage.addVehicle(car5)
    garage.addVehicle(car6)
    garage.fixGarage()
//    employee1.fix(ferrari)
//    employee1.fix(car)




   // println(garage.spit())


   // println(garage.vehicleList)
    //garage.emptyGarage()



    //println(garage.vehicleList(0).vehicleType)

    //garage.getVehicleByType("Car")
  }
}