package com.jianyu.dubbo.order;

public class OrderServiceImpl implements IOrderServices{
    public DoOrderResponse doOrder(DoOrderRequest request) {
        System.out.println("服务方被调用："+request);

        DoOrderResponse response = new DoOrderResponse();
        response.setCode("00");
        response.setMemo("处理成功");
        return response;

    }
}
