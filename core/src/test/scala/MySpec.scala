import org.scalatest.matchers.should.Matchers
import org.scalatest.flatspec.AnyFlatSpec
class MySpec extends AnyFlatSpec with Matchers {
  "This" should "do" in {
    1 + 2 should be(3)
  }
}
