package com.vincent.service.feign.web;

import com.vincent.service.feign.service.SchedualServiceHi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author:vincent
 * @Description:
 * @Date:Create in 下午 4:17 2018/2/10 0010
 */
@RestController
public class HiController {

    @Autowired
    private SchedualServiceHi scheDualServiceHi;

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String hi(@RequestParam String name){
        return scheDualServiceHi.sayHiFromClientOne(name);
    }
}
