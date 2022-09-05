package tacos.data;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import tacos.Ingredient;
import tacos.TacoOrder;

import java.util.List;

public interface OrderRepository extends CrudRepository<TacoOrder, Long> {
    Iterable<TacoOrder> findAll();
}
