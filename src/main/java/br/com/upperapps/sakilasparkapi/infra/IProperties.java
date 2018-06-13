package br.com.upperapps.sakilasparkapi.infra;

import java.util.Properties;

public interface IProperties {
    Properties getProperties(String environment);
}
