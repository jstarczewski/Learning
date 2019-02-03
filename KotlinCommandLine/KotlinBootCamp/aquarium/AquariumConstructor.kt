package aquarium

// capital letter
// constructor with default values
// open means that we allow this class to be subclassible ??XD
open class AquariumConstructor( var length : Int = 100, var height : Int = 20, var width : Int = 40) {
	 open var volume : Int 
	 	get() {return width*height*length / 1000}
		set(value) {height = (value*1000)/ (width*length)}
	// without open water and volume can not be overrriden in TowerTank()
	open var water = volume*0.9

	constructor (numberOfFish : Int) : this() {}
}

class TowerTank() : AquariumConstructor() {

	override var water = volume * 0.8

	override var volume: Int 
		get() = (width* height * length/ 1000 * PI).toInt()
		set(value) {
			this.height = (value*1000) / (width*length)
		}
	

} 
