package br.com.upperapps.sakilasparkapi.configuration;

import br.com.upperapps.sakilasparkapi.enums.Environment;
import br.com.upperapps.sakilasparkapi.util.IJDBCProperties;
import br.com.upperapps.sakilasparkapi.util.IJOOQProperties;
import br.com.upperapps.sakilasparkapi.util.JOOQPropertiesImpl;
import br.com.upperapps.sakilasparkapi.util.MySQLPropertiesImpl;
import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.io.File;
import java.util.Properties;

/**
 * @author Rodrigo Melo
 * @since 2018-06-10
 * @version 1.0
 *
 * Configuration class for JOOQ with a MySQL databese.
 */

public class JOOQConfig {

    public static void main(String[] args) throws Exception {

        String pathDirectory = new File(".").getCanonicalPath();
        IJDBCProperties jdbcProps = new MySQLPropertiesImpl(Environment.DSV.toString());
        IJOOQProperties jooqProps = new JOOQPropertiesImpl(Environment.DSV.toString());

/*        Configuration configuration = new Configuration();
        configuration.withJdbc(new Jdbc()
                .withDriver(jdbcProps.getDriver())
                .withUrl(jdbcProps.getURL())
                .withUser(jdbcProps.getUser())
                .withPassword(jdbcProps.getPassword()));
        configuration.withGenerator(new Generator()
                .withName(jooqProps.getGenerator())
                .withDatabase(new Database()
                        .withName(jooqProps.getDatabase())
                        .withIncludes(".*")
                        .withExcludes("")
                        .withInputSchema(jooqProps.getSchema())
                        .withGenerate(new Generate()
                                .withJavadoc(true))
                        .withTarget(new Target()
                                .withPackageName("br.com.upperapps.sakilasparkapi.jooq")
                                .withDirectory(pathDirectory + "\\src\\main\\java")));

        GenerationTool.generate(configuration);*/
    }

}