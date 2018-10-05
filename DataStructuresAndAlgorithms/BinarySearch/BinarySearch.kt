




fun findBinary(arr: Array<Int>, number : Int) : Int {


	arr.sort()
	for (a : Int in arr)
		println(a)

	var min = 0;
	var max = arr.size-1
	var mid = arr.size/2

	while ((max-min)!=2 && arr[mid]!=number) {
	
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
					mid = min + (max - min)/2
				}
			}
		}
		
	}
	

	return number

}




fun main(args: Array<String>) {
	
	var arr = arrayOf(1,4,2,13,11,34,5)
	println(findBinary(arr, 12))


}
