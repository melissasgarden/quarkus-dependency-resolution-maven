package example;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@QuarkusTest
public class OrderServiceTest {

    @Inject
    OrderService orderService;

    @Test
    public void demo_test_that_runs() {
        Order order = new Order("some_order_id");
        orderService.process(order);
    }
}
