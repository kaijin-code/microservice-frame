package app.order.service;

import io.seata.spring.annotation.GlobalTransactional;
import order.api.BusinessService;
import order.api.OrderService;
import order.api.StorageService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

@DubboService
@Component
public class BusinessServiceImpl implements BusinessService {

    @DubboReference
    private StorageService storageService;
    @DubboReference
    private OrderService orderService;


    @Override
    @GlobalTransactional
    public void purchase(String userId, String money, int orderCount) {

        storageService.deduct(money, orderCount);

        orderService.createV2(userId, orderCount);

    }
}
