object Basic extends App {
    val d = -2.0
    val e = (2.0).unary_-

    println(d + " " + e)

    val addr1 = new Address("test")
    val addr2 = new Address("na")

    println("unary prefix operator")
    println("1 " + addr1.get())
    println("2 " + addr2.get())
    println("#1 " + !addr1)
    println("#2 " + !addr2)
    println("infix operator")
    val addr3 = addr1 + addr2
    println("@1 " + addr3.get())
}


class Address(val name : String) {
    def get() : String = name
    def unary_! : Boolean = if (name == "na") true else false
    def +(addr : Address): Address =  {
        val address = new Address(name + addr.get())
        address
    }
}

//only +,-,!,~ supports this prefix operation
