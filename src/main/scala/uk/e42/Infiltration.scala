package uk.e42

abstract class Infiltration {
	def process(time: Long, scaled_groundwater_level: Double): Double
}
