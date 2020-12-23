package example;

import org.jboss.logging.Logger;

public class InMemoryOrderRepository implements OrderRepository {

    private Logger LOG = Logger.getLogger(InMemoryOrderRepository.class);

    @Override
    public void save(Order order) {
        LOG.info("Saving" + order);
    }
}
