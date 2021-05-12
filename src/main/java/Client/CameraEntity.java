package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "camera", schema = "kursach")
public class CameraEntity {
    private int idcamera;
    private String nameca;
    private String costca;
    private String producerca;

    @Id
    @Column(name = "idcamera")
    public int getIdcamera() {
        return idcamera;
    }

    public void setIdcamera(int idcamera) {
        this.idcamera = idcamera;
    }

    @Basic
    @Column(name = "nameca")
    public String getNameca() {
        return nameca;
    }

    public void setNameca(String nameca) {
        this.nameca = nameca;
    }

    @Basic
    @Column(name = "costca")
    public String getCostca() {
        return costca;
    }

    public void setCostca(String costca) {
        this.costca = costca;
    }

    @Basic
    @Column(name = "producerca")
    public String getProducerca() {
        return producerca;
    }

    public void setProducerca(String producerca) {
        this.producerca = producerca;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CameraEntity that = (CameraEntity) o;
        return idcamera == that.idcamera && Objects.equals(nameca, that.nameca) && Objects.equals(costca, that.costca) && Objects.equals(producerca, that.producerca);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idcamera, nameca, costca, producerca);
    }
}
