abstract class AbsIterator {
  type T
  def hasNext() : Boolean
  def next() : T
}

class StringIterator(s : String) extends AbsIterator {
    type T = Char
    private var i = 0
    def hasNext = i < s.length
    def next() = {
        var ch = s charAt i
        i += 1
        ch
    }
}

trait RichIter extends AbsIterator {
    def foreach(f : T => Unit): Unit = while(hasNext) f(next()  )
}

object Mixins {
    def main(args : Array[String]) {
        class RichStrItr extends StringIterator("Scala") with RichIter
        val rich = new RichStrItr
        rich foreach println
    }
}
