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

class Aquarium<out T : WaterSupply>(val waterSupply : T) {
	
	fun addWater(cleaner: Cleaner<T>) {
		if(waterSupply.dirty) { 
			cleaner.clean(waterSupply)
		} 
		println("adding water from $waterSupply")
	}

	// generic function inside a class is a generic method

	// return T if T is R
	fun <reified/ R: WaterSupply> hasWaterSupplyOfType() = waterSupply is R

}
// wat is inline -> check	
inline fun <reified T: WaterSupply> WaterSupply.isOfType() = this is T


fun genericExample() {


	// after adding various in / out etc and interace we use aquarium like this

	val cleaner = TapWaterCleaner()
	val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
	aquarium.addWater(cleaner)
	println(aquarium.hasWaterSupplyOfType<TapWater>())
	println(aquarium.waterSupply.isOfType<LakeWater>())
	println(aquarium.waterSupply.isOfType<TapWater>())
	

/*
	val aquarium = Aquarium(TapWater())
	aquarium.waterSupply.addChemicalCleaners()

	println(aquarium.waterSupply)
	val aquarium2 = Aquarium(FishStoreWater())
	println(aquarium2.waterSupply)
	var aquarium3 = Aquarium(LakeWater())
	aquarium3.waterSupply.addSpecialFiltering()
	aquarium3.addWater()
*/
}

/*
 
 	In and Out types -> 
			out types can only be passed out of an object or returned
			in types can only be passed into an object
			
	out can be used as return values and in as parameters 
 */
 
interface Cleaner<in T: WaterSupply> {
	fun clean(waterSupply : T)
}
class TapWaterCleaner: Cleaner<TapWater> {

	override fun clean(waterSupply: TapWater) {
		waterSupply.addChemicalCleaners()
	}	

}

fun addItemTo(aquarium : Aquarium<WaterSupply>) = println("item added")
/*
fun genericExample() {
	val aquarium: Aquarium<TapWater> = Aquarium(TapWater())
	addItemTo(aquarium)
}
*/



fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>) {
}
/*
 
 	check -> inline function
	refined ->    
 
 
 */


