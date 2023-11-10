import uk.e42.Wetwell
import uk.e42.Pipe

var wetwell: Wetwell = Wetwell(12.0, 5.0)

object Main {
	def main(args: Array[String]): Unit = {
		wetwell.addInflow(Pipe(0, 6.0))
	}
}

/*
@main def hello: Unit =
	wetwell.addInflow(Pipe(0, 6.0))
	println("good morning vietnam!")
	println(msg)

def msg = "I was compiled by Scala 3. :)"
*/

