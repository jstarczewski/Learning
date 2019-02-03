@ImAPlant class Plant {
	
	fun trim() {}
	fun fertilize() {}

}

annotation class ImAPlant

fun reflections() {

	val classObj = Plant::class

	for(annotation in classObj.annotations) {
		println(annotation.annotationClass.simpleName)
	}

}
