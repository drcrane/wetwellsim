package uk.e42

import scala.collection.mutable.*

class Wetwell(depth: Double) {
	var inflow: ListBuffer[Inflow] = ListBuffer()

	def addInflow(inflow: Inflow): Unit = {
		this.inflow += inflow
	}
}
