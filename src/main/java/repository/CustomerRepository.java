package repository;

import entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
    List<CustomerEntity> findAllById(int id);
    List<CustomerEntity> findAllByPhone(String phone);
    List<CustomerEntity> findAllByAddressContaining(String address);
    List<CustomerEntity> findAllByEmail(String email);
}
