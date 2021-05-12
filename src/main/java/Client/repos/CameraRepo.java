package Client.repos;

import Client.CameraEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CameraRepo extends CrudRepository<CameraEntity, Long>
{
    List<CameraEntity> findCameraEntityByNameca(String nameca);
}
