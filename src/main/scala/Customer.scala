/**
  * Created by Administrator on 07/06/2017.
  */
class Customer(customerID:Int,customerFirstName:String,customerLastName:String) extends Person(customerID,customerFirstName,customerLastName,false,true ) {


  override def toString:String = customerFirstName + " " + customerLastName
}
