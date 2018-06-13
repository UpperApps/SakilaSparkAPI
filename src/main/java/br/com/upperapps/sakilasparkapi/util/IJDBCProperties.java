package br.com.upperapps.sakilasparkapi.util;

public interface IJDBCProperties extends IProperties{
    public String getDriver();
    public String getURL();
    public String getUser();
    public String getPassword();
}
