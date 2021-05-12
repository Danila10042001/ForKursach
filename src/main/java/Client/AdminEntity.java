package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "admin", schema = "kursach")
public class AdminEntity {
    private int idadmin;
    private String namead;
    private String loginad;
    private String passwordad;

    @Id
    @Column(name = "idadmin")
    public int getIdadmin() {
        return idadmin;
    }

    public void setIdadmin(int idadmin) {
        this.idadmin = idadmin;
    }

    @Basic
    @Column(name = "namead")
    public String getNamead() {
        return namead;
    }

    public void setNamead(String namead) {
        this.namead = namead;
    }

    @Basic
    @Column(name = "loginad")
    public String getLoginad() {
        return loginad;
    }

    public void setLoginad(String loginad) {
        this.loginad = loginad;
    }

    @Basic
    @Column(name = "passwordad")
    public String getPasswordad() {
        return passwordad;
    }

    public void setPasswordad(String passwordad) {
        this.passwordad = passwordad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminEntity that = (AdminEntity) o;
        return idadmin == that.idadmin && Objects.equals(namead, that.namead) && Objects.equals(loginad, that.loginad) && Objects.equals(passwordad, that.passwordad);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idadmin, namead, loginad, passwordad);
    }
}
