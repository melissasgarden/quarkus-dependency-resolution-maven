package example;

import javax.enterprise.context.ApplicationScoped;

public class OrderServiceTestConfig {

    @ApplicationScoped
    public OrderRepository orderRepository() {
        return new InMemoryOrderRepository();
    }
}
