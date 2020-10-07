package models;

import untz.Fakultet;

import javax.persistence.*;

@Entity
@Table(name = "Referent")
public class Referent extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "referentID")
    private long referentID;
    @Column(name = "profileImg")
    private String profileImg;

    @OneToOne
    @JoinColumn(name = "faklultetID",referencedColumnName = "fakultetID")
    private Fakultet fakultet;


    public Referent() {
    }

    public long getReferentID() {
        return referentID;
    }

    public void setReferentID(long referentID) {
        this.referentID = referentID;
    }

    public String getProfileImg() {
        return profileImg;
    }

    public void setProfileImg(String profileImg) {
        this.profileImg = profileImg;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }
}
