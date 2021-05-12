package Client.repos;

import Client.AdminEntity;
import Client.CameraEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AdminRepo extends CrudRepository<AdminEntity, Long>{
    List<AdminEntity> findAdminEntityByLoginad(String loginad);
}
