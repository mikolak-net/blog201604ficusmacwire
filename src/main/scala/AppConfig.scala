class AppConfig(val hydro: ServerConfig, val sensors: ServerConfig)

case class ServerConfig(host: String, port: Int)