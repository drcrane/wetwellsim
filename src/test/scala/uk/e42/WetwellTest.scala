package uk.e42

import org.scalatest.funsuite.AnyFunSuite

class WetwellTest extends AnyFunSuite {
	test("Wetwell LevelObservable Test") {
		val wetwell = Wetwell(12.0, 4.0)
		val observableLevel: ObservableLevel = wetwell
		var startTime: Long = 0
		var flowRate: Double = 0.1
		val inflow: Inflow = (time: Long) => {
			val delta = (time - startTime)
			startTime = time
			delta * flowRate
		}
		val volume = inflow.process(10)
		assert(startTime === 10)
		assert(volume === 1)
	}
}
