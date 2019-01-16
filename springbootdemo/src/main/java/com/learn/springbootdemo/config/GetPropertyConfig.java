package com.learn.springbootdemo.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * created by linzj on 2019/1/16
 * 获取配置文件属性 - 通过binder
 **/

@Data
@ConfigurationProperties(prefix = "my.local")
public class GetPropertyConfig {

    private  String dburl;

}
