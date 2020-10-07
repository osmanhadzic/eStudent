package models;

import index.Index;

import javax.persistence.*;
@Entity
@Table(name = "Student")
public class Student extends User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studentID")
    private long studentID;
    @Column(name = "statusStudenta")
    private String statusStudenta;
    @Column(name = "imgStudent")
    private String imgStudent;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "index_ID", referencedColumnName = "IndexID")
    private Index index;





    public Student() {
    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public String getStatusStudenta() {
        return statusStudenta;
    }

    public void setStatusStudenta(String statusStudenta) {
        this.statusStudenta = statusStudenta;
    }

    public Index getIndex() {
        return index;
    }

    public void setIndex(Index index) {
        this.index = index;
    }

    public String getImgStudent() {
        return imgStudent;
    }

    public void setImgStudent(String imgStudent) {
        this.imgStudent = imgStudent;
    }
}
