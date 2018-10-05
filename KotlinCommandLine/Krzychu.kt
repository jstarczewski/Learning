
fun findBinary(arr : Array<Int>, number : Int) : Int {

	var min = 0
	var max = arr.size-1
	var mid = (max - min)/2 
	
	while(min<max) {
	
		if (number > arr[mid]) {
			min = mid + 1
			mid = min + (max - min)/2
		} else if (number < arr[mid]) {
			max = min - 1
			mid = min + (max - min)/2
		} else {
			return mid
		}
	
	
	}
	return -1 
}

fun main(args : Array<String>) {


	var arr = arrayOf(1,3,1,5,34,122,66)
	arr.sort()
	println("Wynik -> ${findBinary(arr, 5)}")


}
