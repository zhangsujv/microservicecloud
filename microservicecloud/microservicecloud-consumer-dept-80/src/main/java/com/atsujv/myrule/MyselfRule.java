package com.atsujv.myrule;

import com.netflix.loadbalancer.AvailabilityFilteringRule;
import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhangSujv
 * @date 2018/12/11 - 21:22
 */
@Configuration
public class MyselfRule {

    @Bean
    public IRule myRule(){
        return new MyRandomRule();
    }
}
