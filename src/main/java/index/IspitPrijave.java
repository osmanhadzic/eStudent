package index;

import models.Profesor;
import models.Student;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "ispitPrijave")
public class IspitPrijave {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "prijavaID")
    private Long prijavaID;

    @Column(name = "prviRokPocetak")
    private Date prviRokPocetak;
    @Column(name = "prviRokKraj")
    private Date prviRokKraj;

    @Column(name = "drugRokPocetak")
    private Date drugiRokPocetak;
    @Column(name = "drugiRokKraj")
    private Date drugiRokKraj;

    @Column(name = "socialniRok")
    private Date socijalni;

    //joins

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "subject_id", referencedColumnName = "subjectID")
    private Subject subject;

    @OneToMany(mappedBy = "prijavljeni")
    private List<Index> prijavljeniStudenti;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "prof_id", referencedColumnName = "profID")
    private Profesor profesor;


    public IspitPrijave() {
    }

    public Long getPrijavaID() {
        return prijavaID;
    }

    public void setPrijavaID(Long prijavaID) {
        this.prijavaID = prijavaID;
    }

    public Date getPrviRokPocetak() {
        return prviRokPocetak;
    }

    public void setPrviRokPocetak(Date prviRokPocetak) {
        this.prviRokPocetak = prviRokPocetak;
    }

    public Date getPrviRokKraj() {
        return prviRokKraj;
    }

    public void setPrviRokKraj(Date prviRokKraj) {
        this.prviRokKraj = prviRokKraj;
    }

    public Date getDrugiRokPocetak() {
        return drugiRokPocetak;
    }

    public void setDrugiRokPocetak(Date drugiRokPocetak) {
        this.drugiRokPocetak = drugiRokPocetak;
    }

    public Date getDrugiRokKraj() {
        return drugiRokKraj;
    }

    public void setDrugiRokKraj(Date drugiRokKraj) {
        this.drugiRokKraj = drugiRokKraj;
    }

    public Date getSocijalni() {
        return socijalni;
    }

    public void setSocijalni(Date socijalni) {
        this.socijalni = socijalni;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public List<Index> getPrijavljeniStudenti() {
        return prijavljeniStudenti;
    }

    public void setPrijavljeniStudenti(List<Index> prijavljeniStudenti) {
        this.prijavljeniStudenti = prijavljeniStudenti;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }
}
