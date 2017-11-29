package exercisesheet09

object Ex19_Ex20 {

  case class Activity(date: String, activity: String)

  //Ex19 method
  def getDates(act: String, v: Vector[Activity]): Vector[String] = {
    var result = Vector[String]()
    for {
      someActivity <- v
      if act == someActivity.activity
    } result = result :+ someActivity.date
    result
  }

  //Ex20 method
  def getActivities(specificDate: String, v: Vector[Activity]): Vector[String] = {
    var result = Vector[String]()
    for {
      entry <- v
      if (entry.date == specificDate)
    } result = result :+ entry.activity
    result
  }

  def main(args: Array[String]): Unit = {
    val activities = Vector(
      Activity("01-01", "Run"),
      Activity("01-03", "Ski"),
      Activity("01-04", "Run"),
      Activity("01-10", "Ski"),
      Activity("01-03", "Run"))

    assert(getDates("Ski", activities) == Vector("01-03", "01-10"))
    assert(getDates("Run", activities) == Vector("01-01", "01-04", "01-03"))
    assert(getDates("Bike", activities) == Vector())

    assert(getActivities("01-01", activities) == Vector("Run"))
    assert(getActivities("01-02", activities) == Vector())
    assert(getActivities("01-03", activities) == Vector("Ski", "Run"))
    assert(getActivities("01-04", activities) == Vector("Run"))
    assert(getActivities("01-10", activities) == Vector("Ski"))
  }

}