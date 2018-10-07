fun main(args: Array<String>) {
	genericExample()

}

open class WaterSupply(var dirty: Boolean)

class TapWater: WaterSupply(true) {

	fun addChemicalCleaners() {
		dirty=false
	}

}
class FishStoreWater: WaterSupply(false)

class LakeWater: WaterSupply(true) {

	fun addSpecialFiltering() {
		dirty = false
	}

}

class Aquarium<T : WaterSupply>(var waterSupply : T) {
	
	fun addWater() {
		check(!waterSupply.dirty) { "water supply needs processed" } 
		println("adding water from $waterSupply")
	}

}

fun genericExample() {

	val aquarium = Aquarium(TapWater())
	aquarium.waterSupply.addChemicalCleaners()

	println(aquarium.waterSupply)
	val aquarium2 = Aquarium(FishStoreWater())
	println(aquarium2.waterSupply)
	var aquarium3 = Aquarium(LakeWater())
	aquarium3.waterSupply.addSpecialFiltering()
	aquarium3.addWater()

}
