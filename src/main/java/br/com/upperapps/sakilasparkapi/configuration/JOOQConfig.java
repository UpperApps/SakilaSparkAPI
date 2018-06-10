package br.com.upperapps.sakilasparkapi.configuration;

import br.com.upperapps.sakilasparkapi.util.PropertiesFactory;
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
        Properties props = PropertiesFactory.getProperties();

        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver(props.getProperty("jdbc.driver"))
                        .withUrl(props.getProperty("jdbc.url"))
                        .withUser(props.getProperty("jdbc.user"))
                        .withPassword(props.getProperty("jdbc.password")))
                .withGenerator(new Generator()
                        .withName(props.getProperty("jooq.generator"))
                        .withDatabase(new Database()
                                .withName(props.getProperty("jooq.database"))
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema(props.getProperty("jooq.schema")))
                        .withGenerate(new Generate()
                                .withJavadoc(true))
                        .withTarget(new Target()
                                .withPackageName("br.com.upperapps.sakilasparkapi.jooq")
                                .withDirectory(pathDirectory + "\\src\\main\\java")));

        GenerationTool.generate(configuration);
    }

}