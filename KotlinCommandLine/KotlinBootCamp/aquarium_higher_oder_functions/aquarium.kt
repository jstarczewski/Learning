package aquarium_higher_oder_functions

data class Fish(var name: String) 

fun main(args: Array<String>) {

}

fun fishExamples() {

	val fish = Fish("elo")

	with(fish.name) {
		this
	}

}
