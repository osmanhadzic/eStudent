package index;

import models.Asistent;
import models.Profesor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subjectID")
    private long subjectID;
    @Column(name = "subjectName")
    private String subjectName;
    @Column(name = "ects")
    private short ects;

    //joins
    @ManyToOne(targetEntity = Index.class)
    @JoinColumn(name = "subject_id",referencedColumnName = "subjectID")
    private Index index;

    @ManyToOne(targetEntity = Profesor.class)
    @JoinColumn(name = "profesor_id",referencedColumnName = "profID")
    private Profesor profesor;

    @ManyToOne(targetEntity = Asistent.class)
    @JoinColumn(name = "asistant_id",referencedColumnName = "asistantID")
    private Asistent asistent;

    @OneToOne(mappedBy = "subject")
    private IspitPrijave prijava;


    public Subject() {
    }

    public long getSubjectID() {
        return subjectID;
    }

    public void setSubjectID(long subjectID) {
        this.subjectID = subjectID;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public short getEcts() {
        return ects;
    }

    public void setEcts(short ects) {
        this.ects = ects;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Asistent getAsistent() {
        return asistent;
    }

    public void setAsistent(Asistent asistent) {
        this.asistent = asistent;
    }

    public IspitPrijave getPrijava() {
        return prijava;
    }

    public void setPrijava(IspitPrijave prijava) {
        this.prijava = prijava;
    }
}
