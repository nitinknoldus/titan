//import gremlin.scala._
import org.scalatest.{FlatSpec, Matchers}

/**
  * Created by nitin on 22/4/16.
  */
class StoreGraph extends FlatSpec with Matchers with CassandraConnect{
    /**
    "Gremlin-Scala" should "connect to Titan database" in {
        val graph = dbconnect().asScala
        val Name = Key[String]("name")

        val v1 = graph +("employee", Name -> "nitin")
        println("vertex v1 created with label:"+v1.label()+ " and name: "+v1.value("name"))

        val v2 = graph +("manager", Name -> "vikas")
        println("vertex v2 created with label: "+v1.label()+ " and name: "+v1.value("name"))

        val edge1 = v2.addEdge("boss", v1)

        val listOfVertices = graph.V.toList()
        val listOfEdges = graph.E.toList()

        listOfVertices.foreach((i: Vertex) => println("id=" + i.id + " label=" + i.label()))

        listOfEdges.foreach((e: Edge) => println("id of edge=" + e.id() + " edgelabel=" + e.label()))

        println("inVertex=" + edge1.inVertex() + " outVertex =" + edge1.outVertex())

        val updatedName = v1.setProperty(Name,"nitinknoldus")

        val stringEquals = updatedName.value("name").equals("nitinknoldus")

        stringEquals should be === true

        val ids = v1.id()
        println("name now ="+v1.value("name"))

        edge1.inVertex().id() shouldBe ids

        val vertices = graph.V.count.head
        val edges = graph.E.count.head

        println("vertices count=" + vertices)
        println("edges count=" + edges)

       // graph.V.drop().iterate()

        graph.V.toList.size shouldBe 0
        //graph.tx().commit()
    }**/
}
