package example;

import org.jboss.logging.Logger;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class OrderService {

    private final Logger LOG = Logger.getLogger(OrderService.class);
    private final OrderRepository repository;

    public OrderService(OrderRepository repository) {
        this.repository = repository;
    }

    public void process(Order order) {
        LOG.info("Processing" + order);
        repository.save(order);
    }
}
