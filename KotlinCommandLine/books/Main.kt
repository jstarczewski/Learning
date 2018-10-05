fun main(args : Array<String>) {
	var Algorithms = eBook("Algorithms", "Sedgewick", "pdf")
	println(Algorithms.toString())


}


open class Book(val title: String, val author: String) {
	
	private var currentPage = 1;

	open fun readPage() {
		currentPage++
	}


}

class eBook(title: String, author : String, var format : String = "text") : Book(title, author) {

	private var wordsRead = 0

	override fun readPage() {
	
		wordsRead+=250

	}
	override fun toString() : String {
		return "Words read -> ${wordsRead}"
	}
} 


