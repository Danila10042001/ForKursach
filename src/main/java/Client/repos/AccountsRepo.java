package Client.repos;

import Client.AccountsEntity;
import Client.CameraEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountsRepo extends CrudRepository<AccountsEntity, Long>{
    List<AccountsEntity> findAccountsEntityByNamepr(String namepr);
}
