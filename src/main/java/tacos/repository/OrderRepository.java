package tacos.repository;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import tacos.TacoOrder;
import tacos.User;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    Iterable<TacoOrder> findAll();

    List<TacoOrder> findByUserOrderByPlacedAtDesc (User user);
    List<TacoOrder> findByUserOrderByPlacedAtDesc(
            User user, Pageable pageable);
}
