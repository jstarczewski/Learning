package aquarium

// capital letter
public class Aquarium {
	
	// fields have setters and getters already
	var width: Int = 20
	var height: Int = 40
	var length: Int = 100

//	fun volume() : Int {
//		return width*height*length / 1000
//	}
	fun vol() = width*height*length / 1000
	//fun vol() : Int =  width*height*length / 1000
	
	//Custom getter && setter that returns a function 
	 var volume : Int 
	 	get() {
			return width*height*length / 1000
		}
		set(value) {height = (value*1000)/ (width*length)}
		// 20000/2000 = 10 -> ok

}

