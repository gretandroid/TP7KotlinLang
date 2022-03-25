package education.cccp.basics

import kotlin.test.Test
import kotlin.test.assertNotNull

class AppTest {
    @Test fun appHasAGreeting() {
        val classUnderTest = App()
        assertNotNull(
            actual = classUnderTest.greeting,
            message = "app should have a greeting"
        )
    }
}
