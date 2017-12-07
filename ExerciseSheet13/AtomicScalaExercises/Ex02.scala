package traits

object Ex02 extends App {

  class Toy

  trait BatteryPower {
    def monitor(charge: Int): String = {
      charge match {
        case a if (charge > 40)                 => "green"
        case b if (charge >= 20 && charge < 40) => "yellow"
        case c if (charge < 20)                 => "red"
      }
    }

    class BatteryPoweredToy extends Toy with BatteryPower

    val toy = new Toy with BatteryPower
    assert(toy.monitor(50) == "green")

  }
}