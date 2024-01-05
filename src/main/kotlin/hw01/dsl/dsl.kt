package hw01.dsl

import hw01.testRunner.ModifiedTestRunner

fun <T : Any> testAround(initializer: ModifiedTestRunner<T>.() -> Unit): ModifiedTestRunner<T> = ModifiedTestRunner<T>().also{ it.initializer() }

fun <T : Any> testGroup(func: ModifiedTestRunner<T>.() -> Unit): ModifiedTestRunner<T> = ModifiedTestRunner<T>().apply(func)