package com.basic;

// import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
// import javax.persistence.Transient;

@Entity
// Annotate the class as an entity
// Specify the table name in the database 
@Table(name = "alien")
// Map this class to the "alien" table
public class Alien {

    @Id
    private int aid;
    //@Transient
    // This field will not be persisted in the database
    private AlienName aname;
    // @Column(name = "acolor")
    private String color;

    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }
    public AlienName getAname() {
        return aname;
    }
    public void setAname(AlienName aname) {
        this.aname = aname;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Alien [aid=" + aid + ", aname=" + aname + ", color=" + color + "]";
    }

   
}            
