package com.springcloud.servicefeign.service.impl;

import com.springcloud.servicefeign.service.SchedualServiceHi;
import org.springframework.stereotype.Component;

/**
 * @Auther: zhongqiuwu
 * @Date: 2018/6/6 15:30
 * @Description:
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi {
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
