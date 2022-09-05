package tacos.data;

import org.springframework.data.repository.CrudRepository;
import tacos.TacoOrder;

import java.util.List;
import java.util.UUID;

public interface OrderRepository extends CrudRepository<TacoOrder, UUID> {
    List<TacoOrder> findByDeliveryCityOrderByDeliveryTo(String city);

    List<TacoOrder> findByDeliveryToAndDeliveryCityAllIgnoresCase(
            String deliveryTo, String deliveryCity);
}
