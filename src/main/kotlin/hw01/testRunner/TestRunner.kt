package hw01.testRunner

interface TestRunner<T> {
    fun runTest(steps: T, test: () -> Unit)
}