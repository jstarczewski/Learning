package spices

class SimpleSpice {

	var name : String = "unknown"
	var level : String = "unknown"
	var heat : Int 
	get() {
		return this.heat*5
	}
	set(value) {
		heat = value*5
	}

}