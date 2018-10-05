package aquariumgenericscollections

fun main(args: Array<String>) {


}

internal fun buildAquarium() = Aquarium() 

class Aquarium(val width: Int = 0, var height: Int = 40, val length: Int = 100) {

	var volume
		got() = width * height * length / 1000
		set(value) { height = (value * 1000) / (width * length) }

}
