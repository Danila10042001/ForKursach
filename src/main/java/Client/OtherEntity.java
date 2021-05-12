package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "other", schema = "kursach")
public class OtherEntity {
    private int idother;
    private String nameot;
    private String costot;
    private String producerot;

    @Id
    @Column(name = "idother")
    public int getIdother() {
        return idother;
    }

    public void setIdother(int idother) {
        this.idother = idother;
    }

    @Basic
    @Column(name = "nameot")
    public String getNameot() {
        return nameot;
    }

    public void setNameot(String nameot) {
        this.nameot = nameot;
    }

    @Basic
    @Column(name = "costot")
    public String getCostot() {
        return costot;
    }

    public void setCostot(String costot) {
        this.costot = costot;
    }

    @Basic
    @Column(name = "producerot")
    public String getProducerot() {
        return producerot;
    }

    public void setProducerot(String producerot) {
        this.producerot = producerot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OtherEntity that = (OtherEntity) o;
        return idother == that.idother && Objects.equals(nameot, that.nameot) && Objects.equals(costot, that.costot) && Objects.equals(producerot, that.producerot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idother, nameot, costot, producerot);
    }
}
