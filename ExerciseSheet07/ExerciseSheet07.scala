

object ExerciseSheet07 extends App {

	def matchColour(colour:String):String = {
			colour match {
			case "red" => "RED"
			case "blue" => "BLUE"
			case "green" => "GREEN"
			case _ => "UNKNOWN COLOUR: " + colour
			}
	}

	/*def matchColourRewritten(colour:String):String = {
	  //TODO
	}*/

	def oneOrTheOtherRewritten(exp:Boolean):String = {
			exp match {
			case true => "True!"
			case false=> "It's false!"
			}
	}

	def checkTruth(exp1:Boolean, exp2:Boolean):String = {
			if(exp1 && exp2) {
				"Both are true"
			}
			else if(!exp1 && !exp2) {
				"Both are false"
			}
			else if(exp1) {
				"First: true, second: false"
			}
			else {
				"First: false, second: true"
			}
	}

	def checkTruthRewritten (exp1:Boolean, exp2:Boolean): String = {
			(exp1,exp2) match {
			case (true, true) => "Both are true!"
			case (false, false)=> "Both are false!"
			case (true, false) => "First: true, second: false"
			case (_,_) => "First: false, second: true"
			}
	}

	var weather_forecast:String = null
			def forecast (percentageCloudiness: Int): String = {
					percentageCloudiness match {
					case 100 => "Sunny"
					case 80  => "Mostly Sunny"
					case 50  => "Partly Sunny"
					case 20  => "Mostly cloudy"
					case 0   => "Cloudy"
					case _   => "Unknown"
					}
	}

}