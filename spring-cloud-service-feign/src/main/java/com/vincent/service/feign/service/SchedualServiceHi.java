package com.vincent.service.feign.service;

import com.vincent.service.feign.service.impl.SchedualServiceHiImpl;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @Author:vincent
 * @Description:
 * @Date:Create in 下午 4:14 2018/2/10 0010
 */
@FeignClient(value = "service-hi",fallback = SchedualServiceHiImpl.class)
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHiFromClientOne(@RequestParam(value = "name") String name);
}
