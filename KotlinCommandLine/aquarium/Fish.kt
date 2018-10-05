package aquarium

// open parameter allows class to be subclassible  
open class Fish(val friendly: Boolean = true, volumeNeeded: Int) {

	// In kotlin most classes have 1 constructor with default values and constructor overloading is not needed

	init {
		println("constructor of fish")
		
	}

		/*
		 	init blocks always run before secondary constructors, can be everywhere 
		 
		 */


	// In kotlin most classes do not need secondary contructor but when it is needed it should call this (which is primary constructor) and look like this

	constructor() : this (true, 9) {
		println("Secondary constructor -> twoja stara")
	}

	val size: Int 
	init {
		if (friendly) {
			size = volumeNeeded
		} else {
			size = 2 * volumeNeeded
		}
	}

	// use 1 constr with default parameters and sometimes helper methods as
		// fun makeDefaultFish() = Fish(true, 20)

}

