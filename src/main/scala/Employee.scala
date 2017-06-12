/**
  * Created by Administrator on 07/06/2017.
  */
class Employee(employeeFirstName:String,employeeLastName:String,var isFree:Boolean,assignedTo:Int) extends Person(employeeFirstName,employeeLastName,true,false,assignedTo) {

  override def toString:String = employeeFirstName + " " + employeeLastName

  def fix(vehicle: Vehicle): Unit ={
    val timeSleep = vehicle.getTimeToFix()*100
    if(isFree==true){
      isFree = false
      Thread.sleep(timeSleep.toInt)
      vehicle.fixVehicle()
      println("Employee No: "+personID +  " has fixed " + vehicle.registration.toString);isFree = true
    }
    else{
      println("Employee is Busy right now")
    }

  }
}
//have all the employee fix the garage recursively. get employee id frm list of employee and then recursively fix the garage until the garage is empty and then send the bill to the corresponding customer.