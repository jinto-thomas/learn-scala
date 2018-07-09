object MatchObj {
	def main(args : Array[String]) {
		val first = if (!args.isEmpty) args(0) else ""

		val frnd = {
			first match {
				case "salt" => "pepper"
				case "mango" => "tree"
				case "hello" => "world"
				case _ => "huh? :/"
			}
		}
		println(frnd)
	
	}

}
