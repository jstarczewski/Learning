package buildings

fun main(args: Array<String>) {
	
	Building(Wood()).build()

}
open class BaseBuildingMaterial() {

 	open var numberNeeded: Int = 1

}

class Wood() : BaseBuildingMaterial() {

	override var numberNeeded = 4

}

class Brick() : BaseBuildingMaterial() {

	override var numberNeeded = 8

}

class Building<T: BaseBuildingMaterial>(var baseBuilding : T) {

	var baseMaterialsNeeded = 100
	var actualMaterialsNeeded = baseBuilding.numberNeeded * baseMaterialsNeeded

	//fun build() : Unit -> { println("$actualMaterialsNeeded ${baseBuilding::class.simpleName} required")}

	fun build()  { 
		println("$actualMaterialsNeeded required")
	}

} 
