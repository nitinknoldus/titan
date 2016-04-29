//import gremlin.scala._
import org.scalatest._

/**
  * Created by nitin
  */
class SimpleSpec extends FlatSpec with Matchers with InMemoryConnect {
/**
  "Gremlin-Scala" should "connect to Titan database, pull out Saturn's keys and shutdown cleanly" in {
    val graph = connect().asScala

    val Name = Key[String]("name")
    val Planet = "planet"
    val Saturn = "saturn"

    (1 to 5) foreach { i =>
      graph + (Planet, Name -> s"vertex $i")  //1st param is label, second is name
    }

    val list = graph.V.toList()

    list.foreach((i: Vertex) => println(i.id()+":"+i.value("name")+":"+i.label()))

    graph + (Saturn, Name -> Saturn)

    graph.V.count.head shouldBe 6     //assert

    val traversal = graph.V.value(Name)
    traversal.toList.size shouldBe 6  //assert

    graph.V.hasLabel(Saturn).count.head shouldBe 1  //assert

    val saturnQ = graph.V.hasLabel(Saturn).head
    saturnQ.value2(Name) shouldBe Saturn

    graph.close
  }**/
}