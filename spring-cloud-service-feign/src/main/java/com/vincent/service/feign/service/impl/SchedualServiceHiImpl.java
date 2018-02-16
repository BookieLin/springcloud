package com.vincent.service.feign.service.impl;

import com.vincent.service.feign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Author:vincent
 * @Description:
 * @Date:Create in 下午 8:53 2018/2/10 0010
 */
@Component
public class SchedualServiceHiImpl implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
