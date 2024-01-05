package hw01

import hw01.dsl.testAround
import hw01.tests.*

fun main() {
    println("### START MAIN ### \n ")

    testAround {
        runTest(BeforeTwiceAndAfterTwiceTestClass()) { println("§ invoke test BeforeTwiceAndAfterTwiceTestClass STARTED") }
    }

    testAround {
        runTest(BeforeAndAfterTestClass()) { println("§ invoke test BeforeAndAfterTestClass STARTED") }
    }

    testAround {
        runTest(AfterOnlyTestClass()) { println("§ invoke test AfterOnlyTestClass STARTED") }
    }

    testAround {
        runTest(BeforeOnlyTestClass()) { println("§ invoke test BeforeOnlyTestClass STARTED") }
    }

    testAround {
        runTest(EmptyTestClass()) { println("§ invoke test EmptyTestClass STARTED") }
    }

    println("### FINISH MAIN ###")
}