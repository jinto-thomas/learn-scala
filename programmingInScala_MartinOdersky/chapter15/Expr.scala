object Expr {
    def main(args : Array[String]) {
    
    val x = "true"
    
    check(x)
    
    }

    def check(x : Any) {
        x match {
            case true => println("True flag")
            case false => println("False flag")
            case _ => println("wrong option")
        }
    }

}
