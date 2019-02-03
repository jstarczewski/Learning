fun main(args : Array<String>) {
	println(canAddFish(10, listOf(3,3,3)))
	println(canAddFish(8, listOf(2,2,2), hasDecorations = false))
	println(canAddFish(9, listOf(1,1,3), 3))
	println(canAddFish(10, listOf(), 7, true))
}

fun canAddFish(size : Int, currentFish : List<Int>, fishSize : Int = 2, hasDecorations : Boolean = true) : Boolean{
		if(hasDecorations) 
		 	return ((size*0.8-(currentFish.sum())-fishSize) >= 0) 
		else 
			return ((size-(currentFish.sum())-fishSize) >= 0)

}
