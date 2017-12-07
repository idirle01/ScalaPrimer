package traits

object Ex01 extends App {

  trait EnergySource

  trait BatteryPower {
    def monitor(charge: Int): String = {
      charge match {
        case a if (charge > 40)                 => "green"
        case b if (charge >= 20 && charge < 40) => "yellow"
        case c if (charge < 20)                 => "red"
      }
    }

    class Battery extends EnergySource with BatteryPower

    val battery = new Battery
    assert(battery.monitor(80) == 80)
    assert(battery.monitor(30) == 30)
    assert(battery.monitor(10) == 10)
  }
}