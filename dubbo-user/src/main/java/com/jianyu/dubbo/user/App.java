package com.jianyu.dubbo.user;

import com.jianyu.dubbo.order.DoOrderRequest;
import com.jianyu.dubbo.order.DoOrderResponse;
import com.jianyu.dubbo.order.IOrderServices;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context  = new ClassPathXmlApplicationContext("order-consumer.xml");

        IOrderServices services = (IOrderServices) context.getBean("orderServices");

        DoOrderRequest request = new DoOrderRequest();
        request.setName("包子哥哥");
        DoOrderResponse response = services.doOrder(request);

        System.out.println(response);

        System.in.read();

    }
}
