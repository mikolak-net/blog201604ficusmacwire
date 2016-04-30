import com.softwaremill.tagging._

/**
  * "Container" config class.
  *
  * For extra credit, change into case class and watch what happens.
  */
class AppConfig(val hydro: ServerConfig @@ HydroService, val sensors: ServerConfig @@ SensorService)

case class ServerConfig(host: String, port: Int)