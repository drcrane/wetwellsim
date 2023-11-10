package uk.e42

import org.scalatest.funsuite.AnyFunSuite

class AsymptoteTest extends AnyFunSuite {
	test("An Asymptotic Function") {
		var lastProcessCallTime: Long = 0
		var flowAtMaxGroundwaterLevel = 10.0
		val infiltration: Infiltration = (time: Long, scaled_groundwater_level: Double) => {
			val delta = time - lastProcessCallTime
			lastProcessCallTime = time
			flowAtMaxGroundwaterLevel
		}
	}
}
