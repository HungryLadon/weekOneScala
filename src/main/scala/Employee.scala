import scala.collection.mutable.ArrayBuffer
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import scala.util.{Failure, Success}

/**
  * Created by Administrator on 07/06/2017.
  */

class Employee(employeeFirstName:String,employeeLastName:String,var isFree:Boolean) extends Person(employeeFirstName,employeeLastName,true,false) {

  override def toString: String = employeeFirstName + " " + employeeLastName

  def fix(vehicle: Vehicle): Unit = {
    isFree = false
    val timeSleep = vehicle.getTimeToFix() * 100
    vehicle.fixVehicle()
    vehicle.calculateBill()
    println("Employee No: " + personID + " has fixed " + vehicle.registration.toString + " Time Taken: " + timeSleep / 100 + " Minutes")

  }

}

//get current time
//get end time
//using future