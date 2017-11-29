package exercisesheet09

object Ex08_Ex09 {

  def pluralise = (word: String) => (word + "s")

  def main(args: Array[String]): Unit = {
    assert(pluralise("cat") == "cats")
    assert(pluralise("dog") == "dogs")
    assert(pluralise("silly") == "sillys")

    var s = ""
    val words = Vector("word", "cat", "animal")
    words.foreach(n => (s += pluralise(n) + " "))
    assert(s == "words cats animals ")

  }
}