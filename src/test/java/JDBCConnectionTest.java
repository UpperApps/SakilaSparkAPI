import br.com.upperapps.sakilasparkapi.enums.Environment;
import br.com.upperapps.sakilasparkapi.util.IJDBCProperties;
import br.com.upperapps.sakilasparkapi.util.JDBCConnection;
import br.com.upperapps.sakilasparkapi.util.MySQLPropertiesImpl;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;

public class JDBCConnectionTest {

    private static IJDBCProperties properties;

    @BeforeClass
    public static void initialize(){
        properties = new MySQLPropertiesImpl(Environment.DSV.toString());
    }

    @Test
    public void givenParameters_whenConnectionClosedFalse_thenCorrect(){

        Connection connection = JDBCConnection.getConnection(properties);

        try {
            boolean isClosed = connection.isClosed();
            Assert.assertFalse(isClosed);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Test
    public void closingConnection_whenConnectionNull_thenCorrect(){

        Connection connection = JDBCConnection.getConnection(properties);
        try {
            JDBCConnection.closeConnection();
            boolean isClosed = connection.isClosed();
            Assert.assertTrue(isClosed);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
