/**
  * Created by Administrator on 07/06/2017.
  */
class Employee(employeeID:Int,employeeFirstName:String,employeeLastName:String) extends Person(employeeID,employeeFirstName,employeeLastName,true,false ) {

  override def toString:String = employeeFirstName + " " + employeeLastName
}
