import java.util.*

fun main(args: Array<String>) {
    //println(if (Integer.valueOf(args[0]) > 12) "Good morning Kotlin" else "Good night Kotlin")
    feedTheFish()
}
fun feedTheFish() {

    val day = randomDay()
    val food = randomFood()
    println("Today is $day and the fish eat $food")
}
fun randomDay() : String {
    val days = listOf("Monday", "Teusday", "Wednesday", "Czwartek", "Piatek", "Sobota", "Sontag")
    return days[(Random().nextInt(days.size))]
}
fun randomFood() : String {
    val foods = listOf("Kebab", "Pizza", "Twaróg")
    return foods[(Random().nextInt(foods.size))]
}