/*
 
 	The only difference beetween abstract classes and interfaces is that abstract classes can
	have constructors and interfaces cannot 
 
	Both abstract classses and interfaces can have methods (FUNCTIONS) implementation in interafaces
	we call them a defaulut implementatino

 */

interface AquariumAction {

	fun eat()
	fun jump()
	fun clean()
	fun catchFish()
	// default implementation
	fun swim() {
		println("swim")
	}

}
interface FishAction {
	fun eat()
}
interface FishColor {
	val color: String
}
abstract class AquariumFish: FishAction {

	abstract val color : String
	override fun eat() = println("yum")

	// use abstract class anytime you cannot compleate a class 
}


/**
 
 	Interface delegation lets you add features to a class via composition
	composition is when a use an instance of other class 
 
 
 **/

 fun main(args: Array<String>) {
	delegate()
 	
 }

//class Plecostomus : FishAction, FishColor by GoldColor {
//	override fun eat() {
//		println("elooo")
//	}
//}
//*
//class Plecostomus(fishColotr : FishColor = GoldColor) : FishAction {
//	override fun eat() {
//		println("elooo")
//	}
//}

/*
 	There we have some fucked up delegation
 */

class Plecostomus(fishColor : FishColor = GoldColor) : 
	FishAction by PrintingFishAction("food"), 
	FishColor by fishColor


 fun delegate() {
 
 	val pleco = Plecostomus()
	println("Fish color = ${pleco.color}")
	pleco.eat()

 }


// Here kotlin lets us declare a classs which is a singleton (only one instance) we do that by using word object instead of class 

object GoldColor: FishColor {
	override val color = "gold"
}

object RedColor: FishColor {
	override val color = "red"
}
object GreenColor: FishColor {
	override val color = "green"
}
class PrintingFishAction(val food: String): FishAction {
	override fun eat() {
		println(food) 
	}
}



