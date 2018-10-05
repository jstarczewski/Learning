package aquarium

fun main(args : Array<String>) {
	buildAquariumConstructor()	
}
fun buildAquariumConstructor() {
	val myAquarium = AquariumConstructor(5,10,15)
	println("Length: ${myAquarium.length}"
	+ "Width: + ${myAquarium.width}"
	+ "Height: + ${myAquarium.height}"
	)
	myAquarium.volume = 20
	println(myAquarium.volume)
	println(myAquarium.height)
	//var smallAquarim = Aquarium(20,15,30)
	// to make it more readable do like below ->
		var smallAquarium = AquariumConstructor(length = 20, height = 15, width = 30)
		println("${smallAquarium.length} to dlugosc")
}
/*
 	$ kotlinc Main.kt Aquarium.kt -include-runtime -d Main.jar
	$ java -jar Main.jar
 */


 /*
  	In kotlin everything is public by default

	--> Package Visibility 
		public - default (Everywhere)
		private - File
		internal - Module
	--> Class visibility
		public - Default, Class and public members
		private - Inside class, subclasses CANT see
		protected - Inside class, Subclass CAN see
		internal - Module (classes compiled togheter)
  */
 
 
 

