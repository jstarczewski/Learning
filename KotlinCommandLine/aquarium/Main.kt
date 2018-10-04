package aquarium

fun main(args : Array<String>) {
	buildAquarium()	
}
fun buildAquarium() {
	val myAquarium = Aquarium()
	println("Length: ${myAquarium.length}"
	+ "Width: + ${myAquarium.width}"
	+ "Height: + ${myAquarium.height}"
	)
	myAquarium.volume = 20
	println(myAquarium.volume)
	println(myAquarium.height)
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
 
 
 
