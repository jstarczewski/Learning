package aquariumgenericscollections

fun main(args: Array<String>) {


}

internal fun buildAquarium() = Aquarium() 

class Aquarium(val width: Int = 0, var height: Int = 40, val length: Int = 100) {

	var volume
		got() = width * height * length / 1000
		set(value) { height = (value * 1000) / (width * length) }


	

}


/*
 	Giving constants values during execution -> 
			const val rocks = 3
	During progrma run 
			val rocks = 3  

			CONST VAL -> works only in top level of classes and classes declared as object (singletons)
 */

 /*
  	Constants inside class needs to be wrapped into 
	
	companion object {
		const val CONTSANT_ELO = "ELOOOO"
	}
	
	Companion objects are initialized from static constructor of the containing class  -> crated when object is created 
	
	Plain objects are initialized lazy when ther are first used

	//Extension functions!!!!

  */

