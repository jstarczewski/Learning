
fun find(arr: Array<Int>, number : Int): Int {
	
	for (i in arr.indices)
		if (arr[i]==number)
			return i
	return number
}

fun findBinary(arr: Array<Int>, number : Int) : Int {


	var min = 0;
	var max = arr.size-1
	var mid = arr.size/2

	while (min<=max) {
	
		when(number) {
			arr[min] -> return min
			arr[max] -> return max
			arr[mid] -> return mid
			else -> {
				if (number > arr[mid]) {
					min = mid+1
					mid = min + (max - min)/2 
				}
				else {
					max = mid-1
					mid = min + (max - min)/2
				}
			}
		}
		
	}
	

	println("not found")
	return number

}




fun main(args: Array<String>) {
	
	var arr = arrayOf(1,2,4,56,12,3,1,22)
	arr.sort()
	println("Index is ${findBinary(arr, 56)}")

}
