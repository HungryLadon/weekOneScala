/**
  * Created by Administrator on 07/06/2017.
  */
class Customer(customerFirstName:String,customerLastName:String,ownerOf:Int) extends Person(customerFirstName,customerLastName,false,true,ownerOf) {


  override def toString:String = customerFirstName + " " + customerLastName + " owner of " + ownerOf

}
