package br.com.upperapps.sakilasparkapi.DTO;

import com.google.gson.annotations.SerializedName;

import java.sql.Timestamp;

public class ActorDTO {

    private Short id;
    @SerializedName("first_name")
    private String firsName;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("last_update")
    private Timestamp lastUpdate;

    public ActorDTO(Short id, String firsName, String lastName, Timestamp lastUpdate) {
        this.id = id;
        this.firsName = firsName;
        this.lastName = lastName;
        this.lastUpdate = lastUpdate;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirsName() {
        return firsName;
    }

    public void setFirsName(String firsName) {
        this.firsName = firsName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }
}
