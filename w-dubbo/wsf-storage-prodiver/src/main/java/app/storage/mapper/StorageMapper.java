package app.storage.mapper;

import org.apache.ibatis.annotations.Param;

public interface StorageMapper {

    void reduceStorage(@Param("commodityCode") String commodityCode);
}
