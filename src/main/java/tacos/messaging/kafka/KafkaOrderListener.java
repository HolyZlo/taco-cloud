package tacos.messaging.kafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import tacos.TacoOrder;
import tacos.messaging.jms.KitchenUI;

@Component
public class KafkaOrderListener {
    private KitchenUI ui;
    @Autowired
    public KafkaOrderListener(KitchenUI ui) {
        this.ui = ui;
    }
    @KafkaListener(topics="tacocloud.orders.topic")
    public void handle(TacoOrder order) {
        ui.displayOrder(order);
    }
}
