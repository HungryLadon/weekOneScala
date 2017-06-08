/**
  * Created by Administrator on 06/06/2017.
  */
class Motorbike(var bikeID:Int, var bikeRegistration:String,var bikeNeedsFix:Boolean,var bikeFault:String) extends Vehicle(bikeID,bikeRegistration,"Motorbike",bikeNeedsFix,bikeFault){


  override def toString = s"Motorbike($bikeID, $bikeRegistration, $bikeNeedsFix, $bikeFault)"
}
