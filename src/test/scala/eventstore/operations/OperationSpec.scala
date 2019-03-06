package eventstore
package operations

import org.specs2.mutable.Specification
import org.specs2.specification.Scope

trait OperationSpec extends Specification {

  protected trait OperationScope extends Scope {
    val client: Client = ()
  }

  type Client = Unit

}
