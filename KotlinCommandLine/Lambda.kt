fun main(args : Array<String>) {
	
	println(waterfall(100))
	println(waterfallOtherWay(100))
	dirtyProcessor() 
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
