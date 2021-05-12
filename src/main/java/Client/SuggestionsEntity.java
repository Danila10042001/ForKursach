package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "suggestions", schema = "kursach")
public class SuggestionsEntity {
    private int idsuggestions;
    private String name;
    private String email;
    private String phone;
    private String rate;
    public SuggestionsEntity(){}
    public SuggestionsEntity(String name, String email, String phone, String rate)
    {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.rate = rate;
    }

    @Id
    @Column(name = "idsuggestions")
    public int getIdsuggestions() {
        return idsuggestions;
    }

    public void setIdsuggestions(int idsuggestions) {
        this.idsuggestions = idsuggestions;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "rate")
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SuggestionsEntity that = (SuggestionsEntity) o;
        return idsuggestions == that.idsuggestions && Objects.equals(name, that.name) && Objects.equals(email, that.email) && Objects.equals(phone, that.phone) && Objects.equals(rate, that.rate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idsuggestions, name, email, phone, rate);
    }
}
