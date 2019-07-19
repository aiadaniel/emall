package com.vigorous.emall.portal.service.imp;

import com.vigorous.common.model.ItemCategory;
import com.vigorous.emall.portal.serivce.PortalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/25 19:09
 */
@RestController
public class PortalServiceImpl implements PortalService {

    @Override
    @GetMapping("/getAllItemCategory")
    public List<ItemCategory> getAllItemCategory() {
        return null;
    }
}
