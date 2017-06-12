/**
  * Created by Administrator on 06/06/2017.
  */
case class Motorbike(var bikeRegistration:String,private val bikeNeedsFix:Boolean,var bikeFault:String) extends Vehicle(bikeRegistration,"Motorbike",bikeNeedsFix,bikeFault){


  override def toString = s"Motorbike($id $bikeRegistration, $needsFix, $bikeFault)"
}
