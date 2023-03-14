package order.api;

import order.dto.Order;

public interface OrderService {

    Order create(String userId, String commodityCode, int orderCount);

    Order createV2(String userId, int money);
}
