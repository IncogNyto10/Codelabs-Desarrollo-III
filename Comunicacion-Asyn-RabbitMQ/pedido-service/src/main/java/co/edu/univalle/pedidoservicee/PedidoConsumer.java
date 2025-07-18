package co.edu.univalle.pedidoservicee;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PedidoConsumer {

    @RabbitListener(queues = RabbitMQConfig.QUEUE_NAME)
    public void recibirListaProductos(List<ProductoDTO> productos) {
        System.out.println("Pedido recibido estos son los productos: " + productos);

    }

}
