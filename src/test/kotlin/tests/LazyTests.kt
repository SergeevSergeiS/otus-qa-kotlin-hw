package tests

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import project.TinyProject.compareDate
import project.TinyProject.outdatedCompareDate

class LazyTests : FunSpec({
    test("compareDate() returns true") {
        compareDate() shouldBe true
    }
    test("outdatedCompareDate() returns true") {
        outdatedCompareDate() shouldBe false
    }
})