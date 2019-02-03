fun main(args : Array<String>) {
:q
:wq
	println(isHot(10))

}
fun isHot(temp : Int) = temp > 20

fun filterCurry(currys : List<String>) : List<String> {
	currys.filter{ it[0] == 'c'}
}
