import scala.io.Source

object LongLines {

    def processFiles(name : String, width : Int) {
        val source = Source.fromFile(name)
        for (line <- source.getLines())
          processLine(name,line, width)
    }

    private def processLine(name: String, line : String, width : Int) {
        if (line.length > width)
          println(name + " : " + line.trim)
    }
}
