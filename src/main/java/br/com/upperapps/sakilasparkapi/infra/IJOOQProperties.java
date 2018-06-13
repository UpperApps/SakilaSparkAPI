package br.com.upperapps.sakilasparkapi.infra;

public interface IJOOQProperties extends IProperties{
    String getGenerator();
    String getDatabase();
    String getSchema();
}
