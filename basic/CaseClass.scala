
case class Message(from: String, to: String, msg: String)

object CaseClass {
    def main(args: Array[String]) {
        val msg1 = Message("jinto", "machine", "test..")

        println(msg1.from)
        
        val msg2 = Message("mine", "ubuntu", "message...")
        println(msg2.msg)
        
        val msg3 = Message("jinto", "machine", "test..")

        println(msg1 == msg2)
        println(msg1 == msg3)

        println("befor copy " + msg2)
        msg2.copy(from = msg2.to)
        println(msg2.from)
    }
}
