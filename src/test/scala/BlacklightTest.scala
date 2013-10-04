package Blacklight

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PingTestSuite extends FunSuite {

  test("Ping Pongs") {
    assert(("ping " + Ping) == "ping pong");
  }
}

