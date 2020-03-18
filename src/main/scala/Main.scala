import typings.rsocketWebsocketClient.mod.{default => RSocketWebSocketClient}

object Main {
  def main(args: Array[String]): Unit = {
    new RSocketWebSocketClient(null)
  }
}
