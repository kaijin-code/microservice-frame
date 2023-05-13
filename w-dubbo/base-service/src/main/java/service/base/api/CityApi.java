package service.base.api;

import service.base.enums.ApiConstants;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//@FeignClient(name = ApiConstants.NAME) // TODO 芋艿：fallbackFactory =
public interface CityApi {

    String PREFIX = ApiConstants.PREFIX + "/tenant";

    @GetMapping(PREFIX + "/id-list")
    List<Long> getTenantIdList();

    @GetMapping(PREFIX + "/valid")
    boolean validTenant(@RequestParam("id") Long id);

}
