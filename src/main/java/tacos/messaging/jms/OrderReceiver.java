package tacos.messaging.jms;

import tacos.TacoOrder;

public interface OrderReceiver {
    TacoOrder receiveOrder();
}
