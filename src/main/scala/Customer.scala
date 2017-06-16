/**
  * Created by Administrator on 07/06/2017.
  */
class Customer(customerFirstName:String,customerLastName:String) extends Person(customerFirstName,customerLastName,false,true) {


  override def toString:String = customerFirstName + " " + customerLastName

}
