package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "accounts", schema = "kursach")
public class AccountsEntity {
    private int idaccounts;
    private String namepr;
    private String costpr;
    private String producer;
    private String namecon;
    private String emailcon;
    private String addresscon;
    private String phonecon;

    @Id
    @Column(name = "idaccounts")
    public int getIdaccounts() {
        return idaccounts;
    }

    public void setIdaccounts(int idaccounts) {
        this.idaccounts = idaccounts;
    }

    @Basic
    @Column(name = "namepr")
    public String getNamepr() {
        return namepr;
    }

    public void setNamepr(String namepr) {
        this.namepr = namepr;
    }

    @Basic
    @Column(name = "costpr")
    public String getCostpr() {
        return costpr;
    }

    public void setCostpr(String costpr) {
        this.costpr = costpr;
    }

    @Basic
    @Column(name = "producer")
    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    @Basic
    @Column(name = "namecon")
    public String getNamecon() {
        return namecon;
    }

    public void setNamecon(String namecon) {
        this.namecon = namecon;
    }

    @Basic
    @Column(name = "emailcon")
    public String getEmailcon() {
        return emailcon;
    }

    public void setEmailcon(String emailcon) {
        this.emailcon = emailcon;
    }

    @Basic
    @Column(name = "addresscon")
    public String getAddresscon() {
        return addresscon;
    }

    public void setAddresscon(String addresscon) {
        this.addresscon = addresscon;
    }

    @Basic
    @Column(name = "phonecon")
    public String getPhonecon() {
        return phonecon;
    }

    public void setPhonecon(String phonecon) {
        this.phonecon = phonecon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AccountsEntity that = (AccountsEntity) o;
        return idaccounts == that.idaccounts && Objects.equals(namepr, that.namepr) && Objects.equals(costpr, that.costpr) && Objects.equals(producer, that.producer) && Objects.equals(namecon, that.namecon) && Objects.equals(emailcon, that.emailcon) && Objects.equals(addresscon, that.addresscon) && Objects.equals(phonecon, that.phonecon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idaccounts, namepr, costpr, producer, namecon, emailcon, addresscon, phonecon);
    }
}
