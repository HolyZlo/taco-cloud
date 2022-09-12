package tacos.messaging.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tacos.TacoOrder;
import tacos.messaging.jms.KitchenUI;

@Component
public class OrderRabbitListener {
    private KitchenUI ui;
    @Autowired
    public OrderRabbitListener(KitchenUI ui) {
        this.ui = ui;
    }
    @RabbitListener(queues = "tacocloud.order.queue")
    public void receiveOrder(TacoOrder order) {
        ui.displayOrder(order);
    }
}

