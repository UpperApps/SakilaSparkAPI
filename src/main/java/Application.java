import br.com.upperapps.sakilasparkapi.DTO.ActorDTO;
import br.com.upperapps.sakilasparkapi.enums.Environment;
import br.com.upperapps.sakilasparkapi.jooq.tables.Actor;
import br.com.upperapps.sakilasparkapi.infra.IJDBCProperties;
import br.com.upperapps.sakilasparkapi.infra.JDBCConnection;
import br.com.upperapps.sakilasparkapi.infra.MySQLPropertiesImpl;
import br.com.upperapps.sakilasparkapi.jooq.tables.records.ActorRecord;
import com.google.gson.Gson;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.util.List;

import static spark.Spark.get;
import static spark.Spark.port;

/**
 * @author Rodrigo Melo
 * @since 2018-06-08
 */
public class Application {

    public static void main(String[] args) {

        // Set the resource port.
        port(8080);

        // TODO Substitute the enum with a environment varible.
        IJDBCProperties properties = new MySQLPropertiesImpl(Environment.DSV.toString());

        // JOOQ Tables
        Actor actor = Actor.ACTOR;

        get("/actors", (req, res) -> {
            try {
                Connection connection = JDBCConnection.getConnection(properties);
                DSLContext dsl = DSL.using(connection, SQLDialect.MYSQL);

                List<ActorDTO> actors = dsl.select().from(actor).fetch().into(ActorDTO.class);

                return new Gson().toJson(actors);
            } finally {
                JDBCConnection.closeConnection();
            }
        });

    }
}
