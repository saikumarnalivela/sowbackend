package models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "sowdetails_table")
public class SowDetails {

    @Id
    @Column(name= "sowID")
        private String sowID;

    @Column(name ="date")
    private String date;

    @Column(name = "Owner")
    private String owner;

    public String getSowID() {
        return sowID;
    }

    public void setSowID(String sowID) {
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

    public SowDetails() {
    }
}
