package index;

import models.Student;
import untz.Fakultet;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Index")
public class Index {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "IndexID")
    private long IndexID;
    @Column(name = "odsjek")
    private String odsjek;
    @Column(name = "godinaUpisa")
    private Date godinaUpisa;
    @Column(name = "ciklus")
    private String ciklus;
    //Join table
    @OneToOne(mappedBy = "index")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "fakultetID")
    private Fakultet fakultet;

    @OneToMany(targetEntity = Subject.class)
    @JoinColumn(name = "user_id")
    private List<Subject> subjectsList;

    @ManyToOne
    @JoinColumn(name = "prijavaID")
    private IspitPrijave prijavljeniStudenti;



    public Index() {
    }

    public long getIndexID() {
        return IndexID;
    }

    public void setIndexID(long indexID) {
        IndexID = indexID;
    }

    public String getOdsjek() {
        return odsjek;
    }

    public void setOdsjek(String odsjek) {
        this.odsjek = odsjek;
    }

    public Date getGodinaUpisa() {
        return godinaUpisa;
    }

    public void setGodinaUpisa(Date godinaUpisa) {
        this.godinaUpisa = godinaUpisa;
    }

    public String getCiklus() {
        return ciklus;
    }

    public void setCiklus(String ciklus) {
        this.ciklus = ciklus;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Fakultet getFakultet() {
        return fakultet;
    }

    public void setFakultet(Fakultet fakultet) {
        this.fakultet = fakultet;
    }

    public List<Subject> getSubjectsList() {
        return subjectsList;
    }

    public void setSubjectsList(List<Subject> subjectsList) {
        this.subjectsList = subjectsList;
    }

    public IspitPrijave getPrijavljeniStudenti() {
        return prijavljeniStudenti;
    }

    public void setPrijavljeniStudenti(IspitPrijave prijavljeniStudenti) {
        this.prijavljeniStudenti = prijavljeniStudenti;
    }
}
