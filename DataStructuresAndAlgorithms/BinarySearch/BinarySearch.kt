
fun find(arr: Array<Int>, number : Int): Int {
	
	for (i in arr.indices)
		if (arr[i]==number)
			return i
	return number
}

fun findBinary(arr: Array<Int>, number : Int) : Int {

	arr.sort()

	var min = 0;
	var max = arr.size-1
	var mid = arr.size/2

	while ((max-min)>2 && arr[mid]!=number) {
	
		when(number) {
			arr[min] -> return min
			arr[max] -> return max
			arr[mid] -> return mid
			else -> {
				if (number > arr[mid]) {
					min = mid
					max = arr.size-1
					mid = min + (max - min)/2 
				}
				else {
					min = 0
					max = mid
					mid = (max - min)/2
				}
			}
		}
		
	}
	

	println("not found")
	return number

}




fun main(args: Array<String>) {
	
	var arr = arrayOf(1,4,2,13,11,34,5)
	println("Index is ${findBinary(arr, 4)}")

}
