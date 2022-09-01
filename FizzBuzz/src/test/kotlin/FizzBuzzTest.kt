import kotlin.test.Test
import kotlin.test.assertEquals

internal class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        assertEquals("1", fizzBuzz(arrayOf(1)))
        assertEquals("1\n2", fizzBuzz(arrayOf(1, 2)))
        assertEquals("1\n2\nFizz", fizzBuzz(arrayOf(1, 2, 3)))
    }
}