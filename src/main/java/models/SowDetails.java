package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class SowDetails {

    @Id
    @Column(name= "sowID")
    private long sowID;

    @Column(name ="date")
    private String date;

    @Column(name = "Owner")
    private String owner;

    public long getSowID() {
        return sowID;
    }

    public void setSowID(long sowID) {
        this.sowID = sowID;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
