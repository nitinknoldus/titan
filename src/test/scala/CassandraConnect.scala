import com.thinkaurelius.titan.core.TitanGraph
import com.thinkaurelius.titan.core.TitanFactory
import org.apache.commons.configuration.BaseConfiguration

/**
  * Created by nitin on 22/4/16.
  */
trait CassandraConnect {
  def dbconnect(): TitanGraph = {
    val conf = new BaseConfiguration()
    conf.setProperty("storage.backend","cassandrathrift")
    conf.setProperty("storage.hostname", "127.0.0.1")
    //conf.setProperty("storage.directory","../titandb/local")
    /*conf.setProperty("index.search.backend", "elasticsearch")
    conf.setProperty("index.search.hostname", "127.0.0.1")
    conf.setProperty("index.search.elasticsearch.local-mode", "false")
    conf.setProperty("index.search.elasticsearch.client-only", "true")
    conf.setProperty("index.search.elasticsearch.sniff", "false")*/
    TitanFactory.open(conf)
  }
}
