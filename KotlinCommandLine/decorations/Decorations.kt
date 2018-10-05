fun main(args: Array<String>) {
	makeDecorations()

}

fun makeDecorations() {

	val d1 = Decorations("T-Rock") 
	println(d1)

	val d2 = Decorations("Mega Rock") 
	println(d2)

	val d3 = Decorations("Mega Rock") 
	println(d3)
	
	/*
	 
		Data classes have default equals() method implementation
	 
	 */
	val d4: Decorations = d3.copy()
	println(d3)
	println(d4)

	val d5 = Decorations2("crystal", "wood", "diver")
	println(d5)

	// Decomposition

	val (rock: String, wood: String, driver: String) = d5
	println(rock)
}

data class Decorations(val rocks: String) {}

data class Decorations2(val rocks: String, val wood: String, val driver: String) {}

