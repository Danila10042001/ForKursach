package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "phone", schema = "kursach")
public class PhoneEntity {
    private int idphone;
    private String nameph;
    private String costph;
    private String producerph;

    @Id
    @Column(name = "idphone")
    public int getIdphone() {
        return idphone;
    }

    public void setIdphone(int idphone) {
        this.idphone = idphone;
    }

    @Basic
    @Column(name = "nameph")
    public String getNameph() {
        return nameph;
    }

    public void setNameph(String nameph) {
        this.nameph = nameph;
    }

    @Basic
    @Column(name = "costph")
    public String getCostph() {
        return costph;
    }

    public void setCostph(String costph) {
        this.costph = costph;
    }

    @Basic
    @Column(name = "producerph")
    public String getProducerph() {
        return producerph;
    }

    public void setProducerph(String producerph) {
        this.producerph = producerph;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhoneEntity that = (PhoneEntity) o;
        return idphone == that.idphone && Objects.equals(nameph, that.nameph) && Objects.equals(costph, that.costph) && Objects.equals(producerph, that.producerph);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idphone, nameph, costph, producerph);
    }
}
