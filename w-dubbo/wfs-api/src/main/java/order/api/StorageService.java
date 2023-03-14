package order.api;

public interface StorageService {

    void deduct(String commodityCode, int count);
}
