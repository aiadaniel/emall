package com.vigorous.emall.sso.service;

import com.vigorous.emall.base.EmallResult;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/28 14:42
 */
@FeignClient(value = "emall-service-sso")
public interface UserService {

    EmallResult login();
}
