package order.api;

public interface BusinessService {

    void purchase(String userId, String commodityCode, int orderCount);
}
