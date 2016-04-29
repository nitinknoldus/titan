//import gremlin.scala._
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by nitin on 22/4/16.
  */
class QueryGraph extends FlatSpec with Matchers with InMemoryConnect {
/**
  "Gremlin-Scala" should "connect to Titan database, pull out Saturn's keys and shutdown cleanly" in {
    val graph = connect().asScala
    val Name = Key[String]("name")
    val Planet = "planet"
    val Saturn = "saturn"

    (1 to 5) foreach { i =>
      graph + (Planet, Name -> s"vertex $i")  //1st param is label, second is name
    }


    //these will add vertex to the graph but will fail in iteration due to property missing.
    val v1 = graph.addVertex("test")
    //graph.addVertex(map)
    //graph.addVertex("test2",map)
    val map = Map("test" -> "abc")

    graph + ("nsez", Key[String]("name") -> "piyush", Key[String]("addr") -> "delhi")

    graph + ("employee", Key[String]("name") -> "nitin")

    println("count="+graph.V.count().toList())

    val list = graph.V.toList()

    list.foreach((i: Vertex) => println(i.id()+":"+i.value("name")+":"+i.label()))

    //graph + (Saturn, Name -> Saturn)

    graph.V.count.head shouldBe 7     //assert

    val traversal = graph.V.value(Name)
    traversal.toList.size shouldBe 7  //assert

    graph.V.hasLabel("planet").count.head shouldBe 5  //assert

    //val saturnQ = graph.V.hasLabel(Saturn).head
    //saturnQ.value2(Name) shouldBe Saturn

    graph.close
  }**/
}
