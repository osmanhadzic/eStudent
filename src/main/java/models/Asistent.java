package models;

import index.Subject;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Asistant")
public class Asistent extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "asistantID")
    private long asistantID;
    @Column(name = "titula")
    private String titula;

    //Join
    @OneToMany(mappedBy = "subject")
    private List<Subject> listSubject;

    public Asistent() {
    }

    public long getAsistantID() {
        return asistantID;
    }

    public void setAsistantID(long asistantID) {
        this.asistantID = asistantID;
    }

    public String getTitula() {
        return titula;
    }

    public void setTitula(String titula) {
        this.titula = titula;
    }

    public List<Subject> getListSubject() {
        return listSubject;
    }

    public void setListSubject(List<Subject> listSubject) {
        this.listSubject = listSubject;
    }
}
