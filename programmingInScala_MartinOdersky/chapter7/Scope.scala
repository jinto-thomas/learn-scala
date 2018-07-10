object Scope extends App {
	val a = 2;
	{
		val a = "new val"
		println(a)
	}
	println(a)
}
