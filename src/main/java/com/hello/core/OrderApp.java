package com.hello.core;

import com.hello.core.domain.Grade;
import com.hello.core.domain.Member;
import com.hello.core.domain.Order;
import com.hello.core.service.MemberService;
import com.hello.core.service.MemberServiceImpl;
import com.hello.core.service.OrderService;
import com.hello.core.service.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
//        MemberService memberService = new MemberServiceImpl();
//        OrderService orderService = new OrderServiceImpl();

        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member = new Member(1L,"isb",Grade.VIP);
        memberService.save(member);

        Order thisOrder = orderService.CreateOrder(member.getId(),"chicken",18500);
        System.out.println(thisOrder.toString());
    }
}
