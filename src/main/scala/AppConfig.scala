import com.softwaremill.tagging._

class AppConfig(val hydro: ServerConfig @@ HydroService, val sensors: ServerConfig @@ SensorService)

case class ServerConfig(host: String, port: Int)