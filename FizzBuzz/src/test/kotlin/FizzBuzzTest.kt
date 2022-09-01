import kotlin.test.Test
import kotlin.test.assertEquals

internal class FizzBuzzTest {

    @Test
    fun testFizzBuzz() {
        assertEquals("1", fizzBuzz(1))
        assertEquals("1\n2", fizzBuzz(2))
        assertEquals("1\n2\nFizz", fizzBuzz(3))
        assertEquals("1\n2\nFizz\n4\nBuzz", fizzBuzz(5))
        assertEquals("1\n2\nFizz\n4\nBuzz\nFizz", fizzBuzz(6))
        assertEquals(
            "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz",
            fizzBuzz(10)
        )
        assertEquals(
            "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz",
            fizzBuzz(15)
        )
    }
}