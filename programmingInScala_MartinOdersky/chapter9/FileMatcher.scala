object FileMatcher {
    def main(args : Array[String]) {
        val lists = filesEnding("scala").mkString
        println(lists)
    }

    private def filesHere = (new java.io.File(".")).listFiles
    private def filesMatching(matcher : String => Boolean) = 
        for (file <- filesHere; if(matcher(file.getName)))
            yield file

    //closure!
    def filesEnding(query : String) =
        filesMatching(_.endsWith(query))
}
