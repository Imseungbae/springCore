package com.hello.core.discount;

import com.hello.core.domain.Member;

public interface DiscountPolicy {
    int discount(Member member, int price);
}
