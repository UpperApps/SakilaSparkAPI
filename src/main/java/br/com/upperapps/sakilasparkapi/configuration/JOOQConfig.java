package br.com.upperapps.sakilasparkapi.configuration;

import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;

import java.io.File;

public class JOOQConfig {

    public static void main(String[] args) throws Exception {

        String pathDirectory = new File(".").getCanonicalPath();

        Configuration configuration = new Configuration()
                .withJdbc(new Jdbc()
                        .withDriver("com.mysql.cj.jdbc.Driver")
                        .withUrl("jdbc:mysql://localhost:3306/sakila?useSSL=false&allowPublicKeyRetrieval=true")
                        .withUser("root")
                        .withPassword("fab014"))
                .withGenerator(new Generator()
                        .withName("org.jooq.codegen.JavaGenerator")
                        .withDatabase(new Database()
                                .withName("org.jooq.meta.mysql.MySQLDatabase")
                                .withIncludes(".*")
                                .withExcludes("")
                                .withInputSchema("sakila"))
                        .withGenerate(new Generate()
                                .withJavadoc(true))
                        .withTarget(new Target()
                                .withPackageName("br.com.upperapps.sakilasparkapi.jooq")
                                .withDirectory(pathDirectory + "\\src\\main\\java")));

        GenerationTool.generate(configuration);
    }

}