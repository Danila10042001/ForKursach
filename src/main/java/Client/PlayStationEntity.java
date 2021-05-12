package Client;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "play_station", schema = "kursach")
public class PlayStationEntity {
    private int idplayStation;
    private String nameps;
    private String costps;
    private String producerps;

    @Id
    @Column(name = "idplay_station")
    public int getIdplayStation() {
        return idplayStation;
    }

    public void setIdplayStation(int idplayStation) {
        this.idplayStation = idplayStation;
    }

    @Basic
    @Column(name = "nameps")
    public String getNameps() {
        return nameps;
    }

    public void setNameps(String nameps) {
        this.nameps = nameps;
    }

    @Basic
    @Column(name = "costps")
    public String getCostps() {
        return costps;
    }

    public void setCostps(String costps) {
        this.costps = costps;
    }

    @Basic
    @Column(name = "producerps")
    public String getProducerps() {
        return producerps;
    }

    public void setProducerps(String producerps) {
        this.producerps = producerps;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayStationEntity that = (PlayStationEntity) o;
        return idplayStation == that.idplayStation && Objects.equals(nameps, that.nameps) && Objects.equals(costps, that.costps) && Objects.equals(producerps, that.producerps);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idplayStation, nameps, costps, producerps);
    }
}
