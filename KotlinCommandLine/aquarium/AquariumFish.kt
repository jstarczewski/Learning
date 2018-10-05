package aquarium 

abstract class AquariumFish {
	abstract val colors: String 
}

class Shark : AquariumFish(), FishAction{

	override val color = "grey"
}

class Plecostomus : AquariumFish(), FishAction{
	override val color = "gold"
}
interface FishAction {

	fun eat() 

}
