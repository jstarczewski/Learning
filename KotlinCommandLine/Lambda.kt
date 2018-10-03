fun main(args : Array<String>) {
	
	println(waterfall(100))
	println(waterfallOtherWay(100))
	dirtyProcessor() 

	/*
	 	The difference between 
			val random1 = random() is that this random1 is assigned at compile time and generated only once when referenced	
			and	
			val random2 = {random()} is a lambda so when used is generated new value 

			random1 has a value assigned at compile time, and the value never changes when the variable is accessed.

			random2 has a lambda assigned at compile time, and the lambda is executed every time the variable is referenced, returning a different value.i
	 
	 
	 */

}
var waterfallOtherWay : (Int) -> Int = { dirty -> dirty/10 }
var waterfall = { dirty : Int -> dirty/10 }

/*
 Rewritten from Kotlin Bootcamp cuz
 	it is interesting
		really
 */

var dirty = 20
val waterFilter: (Int) -> Int = {dirty / 2}
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
	return operation(dirty)
}

fun dirtyProcessor() {
	dirty = updateDirty(dirty, waterFilter)
	println(dirty)
	dirty=20
	dirty = updateDirty(dirty, ::feedFish)
	println(dirty)
	dirty=20
	dirty = updateDirty(dirty, { dirty -> dirty + 50})
	println(dirty)
	// below is also correct
	//dirty = updateDirty(dirty { dirty -> dirty + 50}

}
