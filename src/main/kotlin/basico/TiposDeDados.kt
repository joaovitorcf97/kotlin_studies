package basico

/**
 * Type     Bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ?
 * String   ?
 * char     ?
 */

fun main() {
    var c: Char = 'A'
    var s: String = "Koltin"
    var b: Boolean = true

    var double: Double = 10.0
    var float: Float = 10f
    var long: Long = 10L
    var int: Int = 10
    var short: Short = 10
    var byte: Byte = 10

    println("Double MAX ${Double.MAX_VALUE} - MIN ${Double.MIN_VALUE}")
    println("Float MAX ${Float.MAX_VALUE} - MIN ${Float.MIN_VALUE}")
    println("Long MAX ${Long.MAX_VALUE} - MIN ${Long.MIN_VALUE}")
    println("Int MAX ${Int.MAX_VALUE} - MIN ${Int.MIN_VALUE}")
    println("Short MAX ${Short.MAX_VALUE} - MIN ${Short.MIN_VALUE}")
    println("Byte MAX ${Byte.MAX_VALUE} - MIN ${Byte.MIN_VALUE}")

    /**
     * Unsigned
     */
    println("ULong MAX ${ULong.MAX_VALUE} - MIN ${ULong.MIN_VALUE}")
    println("UInt MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")
    println("UShort MAX ${UShort.MAX_VALUE} - MIN ${UShort.MIN_VALUE}")
    println("UByte MAX ${UByte.MAX_VALUE} - MIN ${UByte.MIN_VALUE}")

}