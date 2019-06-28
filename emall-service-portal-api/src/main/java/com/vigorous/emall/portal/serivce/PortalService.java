package com.vigorous.emall.portal.serivce;

import com.vigorous.common.model.ItemCategory;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/25 16:01
 */
@FeignClient(value = "emall-portal-service")
public interface PortalService {

    @GetMapping(value = "getAllItemCategory")
    List<ItemCategory> getAllItemCategory();
}
