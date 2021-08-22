package com.hello.core;

import com.hello.core.discount.DiscountPolicy;
import com.hello.core.discount.FixedDiscount;
import com.hello.core.discount.RateDiscount;
import com.hello.core.repository.MemberRepository;
import com.hello.core.repository.MemoryMemberRepository;
import com.hello.core.service.MemberService;
import com.hello.core.service.MemberServiceImpl;
import com.hello.core.service.OrderService;
import com.hello.core.service.OrderServiceImpl;

public class AppConfig {

    /**
     * 이곳(외부)에서 구현체를 지정한다.
     * 생성자를 통해 구현체를 주입
     */

    MemberService memberService() {
        return new MemberServiceImpl(new MemoryMemberRepository());
    }

    OrderService orderService() {
        return new OrderServiceImpl(new FixedDiscount(),
                                    new MemoryMemberRepository());
    }
}
