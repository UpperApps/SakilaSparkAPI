import br.com.upperapps.sakilasparkapi.enums.Environment;
import br.com.upperapps.sakilasparkapi.jooq.tables.Actor;
import br.com.upperapps.sakilasparkapi.infra.IJDBCProperties;
import br.com.upperapps.sakilasparkapi.infra.JDBCConnection;
import br.com.upperapps.sakilasparkapi.infra.MySQLPropertiesImpl;
import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;

/**
 * @author Rodrigo Melo
 * @since 2018-06-08
 */
public class Application {

    public static void main(String[] args) {

        Connection conn = null;

        // TODO Substitute the enum with a environment varible.
        IJDBCProperties properties = new MySQLPropertiesImpl(Environment.DSV.toString());

        //buscando dados no banco
        DSLContext create = DSL.using(JDBCConnection.getConnection(properties), SQLDialect.MYSQL);
        Result<Record> result = create.select().from(Actor.ACTOR).fetch();

        for (Record record: result) {
            String firstName = record.getValue(Actor.ACTOR.FIRST_NAME);
            String lastName = record.getValue(Actor.ACTOR.LAST_NAME);

            System.out.println("Actor: " + firstName + " " + lastName);
        }

        JDBCConnection.closeConnection();
    }
}
