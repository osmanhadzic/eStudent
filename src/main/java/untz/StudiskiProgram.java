package untz;

import javax.persistence.*;

@Entity
@Table(name = "StudiskiProgram")
public class StudiskiProgram {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "studProgID")
    private long sudProgID;
    @Column(name = "ciklus")
    private String ciklus;



    public StudiskiProgram() {
    }

}
