package Client.repos;

import Client.PhoneEntity;
import Client.PlayStationEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PhoneRepo extends CrudRepository<PhoneEntity, Long>{
    List<PhoneEntity> findPhoneEntityByNameph(String nameph);
}
