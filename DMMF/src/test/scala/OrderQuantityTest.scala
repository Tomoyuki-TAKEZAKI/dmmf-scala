package orderTaking.domain

import org.scalatest.funsuite.AnyFunSuite

class OrderQuantityTest extends AnyFunSuite:
  test("calc unit quantity") {
    val unit1: UnitQuantity = UnitQuantity(3)
    val unit2: UnitQuantity = UnitQuantity(5)
    val result: UnitQuantity = unit1 + unit2
    assert(result.value == 8)
    assert(result.show == "8 units")
  }

  test("calc kilogram quantity") {
    val kg1: KilogramQuantity = KilogramQuantity(3.5)
    val kg2: KilogramQuantity = KilogramQuantity(5.0)
    val result: KilogramQuantity = kg1 + kg2
    assert(result.value == 8.5)
    assert(result.show == "8.5 kg")
  }
