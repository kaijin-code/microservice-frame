package app.order.service;

import app.order.mapper.OrderMapper;
import order.api.OrderService;
import order.dto.Order;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@DubboService
@Component
public class OrderServiceImpl implements OrderService {

    @Resource
    OrderMapper orderMapper;

    @Override
    public Order create(String userId, String commodityCode, int orderCount) {


        List<Order> order = orderMapper.findOrder();
        System.out.println(order);
        System.out.println(String.format("%s下单, 商品数是%s", userId, orderCount));
        return null;
    }

    @Override
    @Transactional
    public Order createV2(String userId, int money) {
        int i = 1/0;
        orderMapper.addOrder(userId, money);
        System.out.println(String.format("%s下单, 金额是%s", userId, money));
        return null;
    }
}
