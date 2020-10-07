package models;

import index.IspitPrijave;
import index.Subject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Profesor")
public class Profesor extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "profID")
    private long profID;
    @Column(name = "titula")
    private String titula;

    @OneToMany(mappedBy = "subjects")
    private List<Subject> profesorOnSubjects;

    @OneToOne(mappedBy = "profesor")
    private IspitPrijave upisOcjene;

    public Profesor() {
    }

    public long getProfID() {
        return profID;
    }

    public void setProfID(long profID) {
        this.profID = profID;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public List<Subject> getProfesorOnSubjects() {
        return profesorOnSubjects;
    }

    public void setProfesorOnSubjects(List<Subject> profesorOnSubjects) {
        this.profesorOnSubjects = profesorOnSubjects;
    }

    public IspitPrijave getUpisOcjene() {
        return upisOcjene;
    }

    public void setUpisOcjene(IspitPrijave upisOcjene) {
        this.upisOcjene = upisOcjene;
    }
}
