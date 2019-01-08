package com.atsujv.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ZhangSujv
 * @date 2018/12/9 - 15:56
 */
@Configuration
public class Configbean {
  @Bean
    public IRule myIrule(){
        return new RandomRule();
    }
}
