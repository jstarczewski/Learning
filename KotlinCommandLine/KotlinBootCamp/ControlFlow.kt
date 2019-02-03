fun main(args: Array<String>) {

	labels()

}


fun labels() {

	loop@ for (i in 1..100) {
		for (j in 1..100) {
			println("j = $j and i = $i")
			if (i > 10) break@loop
		}
	}

}
