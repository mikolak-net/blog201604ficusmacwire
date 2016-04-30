import com.softwaremill.macwire._
import com.softwaremill.tagging._
import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.readers.ValueReader

object Run extends App {

  lazy val rawConfig = ConfigFactory.load()

  import net.ceedubs.ficus.Ficus._
  import net.ceedubs.ficus.readers.ArbitraryTypeReader._

  //alt approach
  //implicit def taggedReader[TType, TTag](implicit reader: ValueReader[TType]) = reader.map(_.taggedWith[TTag])

  //idiomatic approach
  implicit def taggedReader[TType: ValueReader, TTag] = implicitly[ValueReader[TType]].map(_.taggedWith[TTag])

  lazy val config: AppConfig = rawConfig.as[AppConfig]("app")

  import config._ //IDEA will tell you here that the import is unused. IDEA lies.

  lazy val hydroService = wire[HydroService]
  lazy val sensorService = wire[SensorService]

  println(s"HydroService configured with ${hydroService.config}")
  println(s"SensorService configured with ${sensorService.config}")

}

