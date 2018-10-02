


fun main(args : Array<String>) {


}

fun whatShouldIDoToday(mood : String, weather : String = "sunny", temperatur : Int = 24) {
	when (true) {
		(mood == "happy" && weather == "sunny") -> println("Go for a walk")
		else -> println("Stay home and read")
	}
}
