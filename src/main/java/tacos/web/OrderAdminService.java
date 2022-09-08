package tacos.web;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import tacos.repository.OrderRepository;

@Service
public class OrderAdminService {
    private final OrderRepository orderRepository;

    public OrderAdminService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @PreAuthorize("hasRole('ADMIN')")
    public void deleteAllOrders() {
        orderRepository.deleteAll();
    }
}
