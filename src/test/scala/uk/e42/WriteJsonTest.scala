package uk.e42

import upickle.default.*
import org.scalatest.funsuite.AnyFunSuite

class WriteJsonTest extends AnyFunSuite {
	test("Write some JSON") {
		val list: List[Double] = List(5.0, 6.0, 7.0, 8.0, 7.0)
		val jsonStr: String = upickle.default.write(list)
		println(jsonStr)
	}
}

