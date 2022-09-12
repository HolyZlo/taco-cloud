package tacos.api;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tacos.TacoOrder;
import tacos.messaging.jms.OrderMessagingService;
import tacos.repository.OrderRepository;

@RestController
@RequestMapping(path = "/api/orders",
        produces = "application/json")
@CrossOrigin(origins = "http://localhost:8080")
public class OrderApiController {
    private OrderRepository repo;
    private OrderMessagingService messageService;

    public OrderApiController(
            OrderRepository repo,
            OrderMessagingService messageService) {
        this.repo = repo;
        this.messageService = messageService;
    }

    @GetMapping(produces = "application/json")
    public Iterable<TacoOrder> allOrder() {
        return repo.findAll();
    }

    @PostMapping(consumes = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public TacoOrder postOrder(@RequestBody TacoOrder order) {
        messageService.sendOrder(order);
        return repo.save(order);
    }

}
