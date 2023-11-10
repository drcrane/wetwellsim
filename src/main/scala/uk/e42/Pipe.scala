package uk.e42

/*
 * A pipe that delivers liquid according to a flow_rate specified in l/s
 * times are specified in unix epoch (or just seconds from 0)
 */

class Pipe(var start_time: Long, var flow_rate: Double) extends Inflow {
	/* return the number of litres since the last time process() was called */
	def process(time: Long): Double = {
		val delta: Double = time - start_time
		start_time = time
		delta * flow_rate
	}
}

