import com.softwaremill.macwire._
import com.typesafe.config.ConfigFactory

object Run extends App {

  lazy val rawConfig = ConfigFactory.load()

  import net.ceedubs.ficus.Ficus._
  import net.ceedubs.ficus.readers.ArbitraryTypeReader._

  lazy val config: AppConfig = rawConfig.as[AppConfig]("app")

  import config._ //IDEA will tell you here that the import is unused. IDEA lies.

  lazy val hydroService = wire[HydroService]
  lazy val sensorService = wire[SensorService]

  println(s"HydroService configured with ${hydroService.config}")
  println(s"SensorService configured with ${sensorService.config}")

}

