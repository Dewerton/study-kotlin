import com.github.dewerton.study.kotlin.Sample
import kotlin.test.Test
import kotlin.test.assertEquals

class SampleTest {
    private val testSample: Sample = Sample()

    @Test
    fun testSum() {
        val result = testSample.sum(40, 2)
        val expected = 42
        assertEquals(expected, result)
    }

}