package order.dto;

import lombok.Data;

@Data
public class Order {

    private Integer id;
    private String userId;
    private Integer count;
}
