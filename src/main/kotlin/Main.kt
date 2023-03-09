fun main() {
    var travel = Car("Subaru", "legacy","white",7)
    travel.carry(10)
    travel.identity()
    travel.calculateParkingFees(2)

    var total = Bus("Nissan","Shark", "Blue",14)
       total.maxTripFare(70.5)

}
open class Car( var make: String, var model: String, var color: String, var capacity: Int){
    fun carry(people: Int){
        var x= people-capacity
        if (people== capacity){
            println("Carrying ${people} passengers")
        }else if (people > capacity){
            println("Over capacity by ${x} people")
        }
    }
    fun identity(){
        println("I am a ${color} ${make} ${model}")
    }
     open fun calculateParkingFees(hours: Int): Int{
        var park = hours * 20
        return park
    }
}
class Bus(make: String, model: String,color: String, capacity: Int): Car(make, model, color, capacity){
     fun maxTripFare(fare: Double): Double{
         var max = fare * capacity
         return max
     }

    override fun calculateParkingFees(hours: Int): Int {
        //return super.calculateParkingFees(hours)
        var parkFee = capacity * hours
        return parkFee

    }
}