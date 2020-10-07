package management;

import models.User;

import javax.persistence.*;

@Entity
@Table(name = "Role")
public class Role {
    @Id
    @GeneratedValue
    @Column(name = "roleID")
    private long roleID;
    @Column(name = "student")
    private boolean student;
    @Column(name = "profesor")
    private boolean profesor;
    @Column(name = "asistant")
    private boolean asistant;
    @Column(name = "admin")
    private boolean admin;
    @Column(name = "referent")
    private boolean refeerent;

    //Join tables

    @OneToOne(mappedBy = "Role")
    private User user;

    public Role() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public long getRoleID() {
        return roleID;
    }

    public void setRoleID(long roleID) {
        this.roleID = roleID;
    }

    public boolean isStudent() {
        return student;
    }

    public void setStudent(boolean student) {
        this.student = student;
    }

    public boolean isProfesor() {
        return profesor;
    }

    public void setProfesor(boolean profesor) {
        this.profesor = profesor;
    }

    public boolean isAsistant() {
        return asistant;
    }

    public void setAsistant(boolean asistant) {
        this.asistant = asistant;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public boolean isRefeerent() {
        return refeerent;
    }

    public void setRefeerent(boolean refeerent) {
        this.refeerent = refeerent;
    }
}
