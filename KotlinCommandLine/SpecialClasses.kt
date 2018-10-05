// object is a singleton kotlin 

object MobyDickWhale {

	val author = "Herman Melville"
	
	fun jump() {
	
	}

}
enum class Color(val rgb: Int) {
	RED(0xFF0000),
	GREEN(0x00FF00),
	BLUE(0x0000FF)
	
}

// sealed class is special class that can be subclassed only in the file it was created
// greate for returning success or err from network API 
sealed class 
