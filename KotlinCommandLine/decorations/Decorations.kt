fun main(args: Array<String>) {
	makeDecorations()

}

fun makeDecorations() {

	val d1 = Decorations("T-Rock") 
	println(d1)

}

data class Decorations(val rocks: String) {


}
