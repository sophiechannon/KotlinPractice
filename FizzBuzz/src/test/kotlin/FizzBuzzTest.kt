import kotlin.test.Test
import kotlin.test.assertEquals

internal class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        assertEquals("1", fizzBuzz(arrayOf(1)))
        assertEquals("1\n2", fizzBuzz(arrayOf(1, 2)))
        assertEquals("1\n2\nFizz", fizzBuzz(arrayOf(1, 2, 3)))
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz(arrayOf(1, 2, 3, 4, 5)))
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz", fizzBuzz(arrayOf(1, 2, 3, 4, 5, 6)))
        assertEquals(
            "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz", fizzBuzz(arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)))
    }
}