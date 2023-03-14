package app.storage.service;


import app.storage.mapper.StorageMapper;
import order.api.StorageService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

@DubboService
@Component
public class StorageServiceImpl implements StorageService {

    @Resource
    StorageMapper storageMapper;

    @Override
    @Transactional
    public void deduct(String commodityCode, int count) {

        storageMapper.reduceStorage(commodityCode);
        System.out.println(String.format("reduce the storage user is %s", commodityCode));
    }
}
