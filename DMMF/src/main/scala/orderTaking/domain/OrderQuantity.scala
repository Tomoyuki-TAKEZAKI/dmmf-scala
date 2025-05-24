package orderTaking.domain

type OrderQuantity = UnitQuantity | KilogramQuantity
type UnitQuantity = UnitQuantity.Type
type KilogramQuantity = KilogramQuantity.Type

object UnitQuantity:
  opaque type Type = Int

  def apply(i: Int): Type = i

  extension (u: Type)
    def value: Int = u
    def +(other: Type): Type = u + other
    def show: String = s"${u} units"

object KilogramQuantity:
  opaque type Type = BigDecimal

  def apply(bd: BigDecimal): Type = bd

  extension (k: Type)
    def value: BigDecimal = k
    def +(other: Type): Type = k + other
    def show: String = s"${k} kg"
