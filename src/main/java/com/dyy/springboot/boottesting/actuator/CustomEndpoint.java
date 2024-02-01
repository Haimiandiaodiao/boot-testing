package com.dyy.springboot.boottesting.actuator;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

/**
 * 自定义的不能同时存在多个 @ReadOperation ， 比较特殊的就是LoggersEndpoint
 * @WriteOperation  只能通过JSON来提交数据
 *
 * */
@Component
@Endpoint(id = "printHelloEndpoint")
public class CustomEndpoint {

    private String name = "dddd";

    @ReadOperation()
    public String customEndpoint() {
        return "hello , This is a custom endpoint ->"+name;
    }

    @WriteOperation
    public void   customName(String parameter){
        this.name = parameter;
    }
}

