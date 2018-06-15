package br.com.upperapps.sakilasparkapi.configuration;

import br.com.upperapps.sakilasparkapi.enums.Environment;
import br.com.upperapps.sakilasparkapi.infra.IJDBCProperties;
import br.com.upperapps.sakilasparkapi.infra.IJOOQProperties;
import br.com.upperapps.sakilasparkapi.infra.JOOQPropertiesImpl;
import br.com.upperapps.sakilasparkapi.infra.MySQLPropertiesImpl;
import org.jooq.codegen.GenerationTool;
import org.jooq.codegen.JavaGenerator;
import org.jooq.meta.jaxb.*;

import java.io.File;

/**
 * @author Rodrigo Melo
 * @version 1.0
 * <p>
 * Configuration class for JOOQ with a MySQL databese.
 * @since 2018-06-10
 */

public class JOOQConfig {

    public static void main(String[] args) throws Exception {

        String pathDirectory = new File(".").getCanonicalPath();
        IJDBCProperties jdbcProps = new MySQLPropertiesImpl(Environment.DSV.toString());
        IJOOQProperties jooqProps = new JOOQPropertiesImpl(Environment.DSV.toString());

        Configuration configuration = new Configuration();

        configuration.withJdbc(new Jdbc()
                .withDriver(jdbcProps.getDriver())
                .withUrl(jdbcProps.getURL())
                .withUser(jdbcProps.getUser())
                .withPassword(jdbcProps.getPassword()))
                .withGenerator(new Generator()
                        .withName(jooqProps.getGenerator())
                        .withGenerate(new Generate()
                                .withJavadoc(true)
                                .withPojos(true)
                                .withInterfaces(true)
                                .withDaos(true)
                        )
                        .withDatabase(new Database()
                                .withName(jooqProps.getDatabase())
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema(jooqProps.getSchema())
                        )
                        .withTarget(new Target()
                                .withPackageName("br.com.upperapps.sakilasparkapi.jooq")
                                .withDirectory(pathDirectory + "\\src\\main\\java")
                        )
                );

        GenerationTool.generate(configuration);
    }

}