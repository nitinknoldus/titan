
import com.tinkerpop.blueprints.Vertex
import org.scalatest.{FlatSpec, Matchers}
import scala.collection.JavaConversions._

/**
  * Created by nitin on 27/4/16.
  * This flat spec uses gremlin scala 2.3.0
  */
class Titan054 extends FlatSpec with Matchers with CassandraConnect {

 "Gremlin-Scala" should "connect to Titan database, pull out Saturn's keys and shutdown cleanly" in {
  val graph = dbconnect()

  /**delete vertex with id.
     graph.getVertex(256).remove()
    */


  val vertices: List[Vertex] = graph.query().vertices().toList
  vertices.foreach(Vertex => Vertex.remove())
  (1 to 5) foreach { i =>
   graph.addVertexWithLabel(s"emp-$i")
  }

  val lists = graph.query().vertices().toList

  lists.foreach(  Vertex => println(Vertex)  )

  println(lists(1)+":"+lists(2))

  lists.foreach(Vertex => graph.addEdge(1,lists(Vertex),lists(1),"random"))
  //    graph.addEdge(1,lists.take(0),lists.take(1),"peer")

 }
}
