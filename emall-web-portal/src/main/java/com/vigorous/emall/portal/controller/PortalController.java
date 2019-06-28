package com.vigorous.emall.portal.controller;

import com.vigorous.emall.portal.serivce.PortalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author JiaoTailang
 * @version 1.0
 * @date 2019/6/26 13:43
 */
@Controller
@RequestMapping("/portal")
public class PortalController {

    @Autowired
    PortalService portalService;

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(Model model) {
        return "index";
    }
}
