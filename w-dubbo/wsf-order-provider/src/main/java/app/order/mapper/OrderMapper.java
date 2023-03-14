package app.order.mapper;

import order.dto.Order;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {

   List<Order> findOrder();

   void addOrder(@Param("userId") String userId, @Param("money") int money);
}
