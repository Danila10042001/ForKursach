package Client.repos;

import Client.CameraEntity;
import Client.PlayStationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PlayStationRepo extends CrudRepository<PlayStationEntity, Long>{
    List<PlayStationEntity> findPlayStationEntityByNameps(String nameps);
}
