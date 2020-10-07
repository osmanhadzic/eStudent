package models;


import untz.Fakultet;

import javax.faces.view.facelets.Facelet;
import javax.persistence.*;

@Entity
@Table(name ="Admin")
public class Admin extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "adminID")
    private long adminID;
    @Column(name = "eMail")
    private String eMali;


    //joins
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fakultetID",referencedColumnName = "fakultetID")
    private Fakultet fakultet;

    public Admin() {
    }


    public long getAdminID() {
        return adminID;
    }

    public void setAdminID(long adminID) {
        this.adminID = adminID;
    }

    public String geteMali() {
        return eMali;
    }

    public void seteMali(String eMali) {
        this.eMali = eMali;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }
}
