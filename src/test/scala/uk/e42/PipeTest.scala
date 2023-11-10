package uk.e42

import org.scalatest.funsuite.AnyFunSuite

class PipeTest extends AnyFunSuite {
	test("PipeInflow Flow Rate over Time Test") {
		val pipe: Pipe = Pipe(0, 1.5)
		assert(pipe.process(2) === 3.0)
		assert(pipe.process(2) === 0)
	}
}

