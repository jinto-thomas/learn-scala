abstract class Notification

case class Email(sender : String, subject : String) extends Notification
case class SMS(caller : String, message : String) extends Notification
case class VoiceBox(dialer : String, voice : String) extends Notification

object PatternMatch {


    def showNotification(notification : Notification) : String = {
       notification match {
            case Email(sender,_) => 
                s"you got an email from$sender"
            case SMS(caller,_) =>
                s"You have an sms $caller"
            case VoiceBox(dialer,_) =>
                s"You have a voice note $dialer"
       }
    }
   
    def showType(msg : Notification) : Unit = {
        msg match {
            case a : Email =>
                println("an email")
            case b : SMS =>
                println("a sms")
            case c : VoiceBox =>
                println("a voice note")
        }
    }
    
    def main(args: Array[String]) {
        
        val sms = SMS("121", "Recharge your account!")
        val email = Email("jinto@123.com", "Check your mail")
        val vb = VoiceBox("435423", "hello")

        println(showNotification(sms))
        println(showNotification(vb))

        showType(sms)
    }

}
