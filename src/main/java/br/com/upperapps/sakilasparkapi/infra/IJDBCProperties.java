package br.com.upperapps.sakilasparkapi.infra;

public interface IJDBCProperties extends IProperties{
    String getDriver();
    String getURL();
    String getUser();
    String getPassword();
}
