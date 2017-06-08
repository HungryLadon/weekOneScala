/**Import String
  * Split by '/'->
  * Split them again by spaces->
  * Process the result individually through the dictionary->make it yourself
  *then you concat it back to string.
  *
  *
  *
  */
val MorseDictionary = Map(" "->" ",".-"->"A","-..."->"B","-.-."->"C","-.."->"D","."->"E","..-."->"F","--."->"G","...."->"H",
  ".."->"I",".---"->"J","-.-"->"K",".-.."->"L","--"->"M","-."->"N","---"->"O",".--."->"P","--.-"->"Q",".-."->"R","..."->"S",
  "-"->"T","..-"->"U","...-"->"V",".--"->"W","-..-"->"X","-.--"->"Y","--.."->"Z" )


val morseCode:String = ".... . ..-. --- /-.. .- .. .-.. -.-- / .--. .-. --- --. .-. .- -- -- . .-. / --. --- --- -.. / .-.. ..- -.-. -.- / --- -. / - .... ./ -.-. .... .- .-.. .-.. . -. --. . ... / - --- -.. .- -.--"
  val splitBySlash = morseCode.split('/')
  var bySlash:String=""
  for(i<-0 to splitBySlash.length-1){
    bySlash+=splitBySlash(i)
  }

print("----------------------------------------------------------------------------------------")
  var result:String = ""
  val splitBySpace = bySlash.split(' ')
  for(i<-0 to splitBySpace.length-1){
    var tmp : Option[String] = MorseDictionary.get(splitBySpace(i))
      result+=tmp.getOrElse(" ")
      //println(splitBySpace(i))
  }
  print(result)

  val toMorse:String = "H E L L O H O W A R E Y O U"
  val charToMorse = toMorse.split(" ")
  charToMorse.foreach(println)
  var result2:String = ""
  //print(charToMorse)

for(i<-0 to charToMorse.length-1){
  var tmp :Option[String] = MorseDictionary.get(charToMorse(i))
  result2 +=tmp.getOrElse(" ")
}
println(result2)

