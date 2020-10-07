package untz;

import index.Index;
import models.Admin;
import models.Referent;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Fakultet")
public class Fakultet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "fakultetID")
    private long fakultetID;

    @Column(name = "nazivFakulteta")
    private String nazivFakultet;

    @OneToMany
    private List<Index> listOfStudents;

    @OneToOne(mappedBy = "fakultetID")
    private Admin admin;

    @OneToOne(mappedBy = "fakultetID")
    private Referent referent;


    public Fakultet() {
    }

}
