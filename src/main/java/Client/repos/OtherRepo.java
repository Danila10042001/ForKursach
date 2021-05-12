package Client.repos;

import Client.OtherEntity;
import Client.PhoneEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OtherRepo extends CrudRepository<OtherEntity, Long>{
    List<OtherEntity> findOtherEntityByNameot(String nameot);
}
