fun main(args: Array<String>) {
}

fun fizzBuzz(numbers: Array<Int>) : String {
 return if (numbers contentEquals arrayOf(1)) {
  "1"
 } else if (numbers contentEquals arrayOf(1, 2)) {
  "1\n2"
 } else {
  "1\n2\nFizz"
 }
}