object CreditCard {

    fun isValid(number: String): Boolean {
        return getSize(number) in 1..16 && (sumOfDoubleOddPlace(number) + sumOfEvenPlace(number)) % 10 == 0
    }

    fun getSize(d: String): Int {
        return d.length
    }


    fun sumOfDoubleOddPlace(number: String): Int {
        var sum = 0
        var i = getSize(number) - 2

        while (i >= 0) {
            sum += getDigit((number[i].toString() + "").toInt() * 2)
            i -= 2
        }

        return sum
    }

    fun sumOfEvenPlace(number: String): Int {
        var sum = 0
        var i = getSize(number) - 1
        while (i >= 1) {
            println((number[i].toString() + "").toInt())
            sum += (number[i].toString() + "").toInt()
            i -= 2
        }

        return sum
    }

    fun getDigit(number: Int): Int {
        if (number > 9)
            return number - 9
        return number
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val number = 4539148803436467

        if (isValid(number.toString())) {
            print("valid")
        } else {
            print("invalid")
        }

    }

}