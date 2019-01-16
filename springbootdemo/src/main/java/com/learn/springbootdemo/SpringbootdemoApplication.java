package com.learn.springbootdemo;

import com.learn.springbootdemo.config.GetPropertyConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.bind.Bindable;
import org.springframework.boot.context.properties.bind.Binder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootdemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringbootdemoApplication.class, args);

        Binder binder = Binder.get(context.getEnvironment());

        GetPropertyConfig config= binder.bind("my.local", Bindable.of(GetPropertyConfig.class)).get();

        System.out.println(config.getDburl());


    }

}

