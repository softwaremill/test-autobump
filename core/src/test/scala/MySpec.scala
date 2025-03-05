import org.scalatest.matchers.should.Matchers
import org.scalatest.flatspec.AnyFlatSpec
class MySpec extends AnyFlatSpec with Matchers {
  "This" should "dooo" in {
    1 + 2 should be(3)
  }

  "That" should "do too" in {
    1 + 1 should be(2)
  }

  "One more" should "be fine" in {
    1 + 0 should be(1)
  }

  "Test 1" should "be fine" in {
    1 + 0 should be(1)
  }
}
