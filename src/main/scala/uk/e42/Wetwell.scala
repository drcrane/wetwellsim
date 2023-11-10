package uk.e42

import scala.collection.mutable.*

class Wetwell(capacity: Double, depth: Double) extends ObservableLevel(depth) {
	val inflow: ListBuffer[Inflow] = ListBuffer()

	def addInflow(inflow: Inflow): Unit = {
		this.inflow += inflow
	}
}
