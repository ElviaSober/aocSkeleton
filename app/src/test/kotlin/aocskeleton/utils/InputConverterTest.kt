package aocskeleton.utils

import assertk.assertThat
import assertk.assertions.containsExactly
import org.junit.Test

internal class InputConverterTest {

    @Test
    fun testRowToInts() {
        assertThat(InputConverter.rowToInts("1, 2, 3 ", ',')).containsExactly(1,2,3)
    }
}