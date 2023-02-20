import kotlin.math.PI

fun main(){
  println  (volumeOfCircle(4.0,))
volumeOfCube(9.0)
    volumeOfCubeBoid(6.0,5.0,4.0)
    volumeOfCylinder(8.0,4.0,)
    areaOfCircle(5.0)
   println (fullname("clarine", 19))
    weight("54.0")
}
fun volumeOfCircle(radius:Double,):Double{
    var volume=( 4/3 * PI* radius*radius*radius)
return volume
}
fun volumeOfCube(sidelength:Double):Double{
    var volume=sidelength*sidelength*sidelength
    return volume

}
fun volumeOfCubeBoid(length:Double,width:Double,height:Double):Double{
var volume=length * width*height
    return volume
}
fun volumeOfCylinder(radius: Double,height: Double):Double{
    var volume= PI *radius*radius*height
    return volume
}
fun areaOfCircle(radius: Double):Double{
    var area=radius*radius* PI
    return area
}
fun fullname(name:String,age:Int):String{
    var stmt="Hi i am $name and i am $age years"
    return stmt

}
fun weight(weight:String,){
 print("my weight is " + weight.toString())

}