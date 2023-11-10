package uk.e42

trait ObservableLevel(var level: Double) {
	def currentLevel(): Double = level
	def setLevel(new_level: Double): Unit = level = new_level
}

