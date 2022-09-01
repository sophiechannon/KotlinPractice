fun main() {
}

fun fizzBuzz(numbers: Array<Int>) :String {
 return numbers.map {
  if (it % 3 == 0) {
   "Fizz"
  } else if (it % 5 == 0) {
   "Buzz"
  } else {
   it
  }
 }.joinToString("\n")

// return if (numbers contentEquals arrayOf(1)) {
//  "1"
// } else if (numbers contentEquals arrayOf(1, 2)) {
//  "1\n2"
// } else {
//  "1\n2\nFizz"
// }
}