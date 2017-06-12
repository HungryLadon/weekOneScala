/**
  * Created by Administrator on 07/06/2017.
  */
class Person(val firstName:String,val lastName:String,val isEmployee:Boolean, val willToLive:Boolean,var vehicleID: Int) {
  val personID = Person.nextPersonID()


  override def toString = s"Person($personID,$firstName,$lastName,$isEmployee)"
  def setVehicle():Unit={


  }
}
object Person{
  private var idSequence = 0

  def apply(firstName: String, lastName: String,isEmployee: Boolean, willToLive:Boolean,vehicle: Int) = new Person(firstName, lastName, isEmployee, willToLive,vehicle)

  private def nextPersonID() ={
    idSequence+=1
    idSequence
  }


}