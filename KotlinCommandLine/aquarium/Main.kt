package aquarium

fun main(args : Array<String>) {
	buildAquarium()	
}
fun buildAquarium() {
	val myAquarium = Aquarium()
	println("Length: ${myAquarium.length}")
}


/*
 
 
 
 
 	$ kotlinc Main.kt Aquarium.kt -include-runtime -d Main.jar
	$ java -jar Main.jar
 
 
 
 
 **/
