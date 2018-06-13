package br.com.upperapps.sakilasparkapi.enums;

public enum Environment {
    DSV("Deveopment environment"),
    PRD("Production environment");

    private String description;

    Environment(String description) {
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }
}
