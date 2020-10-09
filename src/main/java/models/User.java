package models;

import management.Role;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
@Entity
@MappedSuperclass
@Table(name = "User")
public abstract class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "userID", unique = true, nullable = false)
    private long userID;
    @Column(name = "firstName",length = 25)
    private String fName;
    @Column(name = "lastName",length = 25)
    private String lName;
    @Column(name = "nameDad")
    private String nameDad;
    @Column(name = "dataBirth")
    private Date dateBirth;
    @Column(name = "placeBirth")
    private String placeBirth;
    @Column(name = "loginName")
    private String loginName;
    @Column(name = "password")
    private String password;
    @Column(name = "isDeleted")
    private Boolean isDeleted;

    //Join table

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "roleID", referencedColumnName = "roleID")
    private Role role;


    public User() {
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public long getUserID() {
        return userID;
    }

    public void setUserID(long userID) {
        this.userID = userID;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getNameDad() {
        return nameDad;
    }

    public void setNameDad(String nameDad) {
        this.nameDad = nameDad;
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public void setDateBirth(Date dateBirth) {
        this.dateBirth = dateBirth;
    }

    public String getPlaceBirth() {
        return placeBirth;
    }

    public void setPlaceBirth(String placeBirth) {
        this.placeBirth = placeBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
