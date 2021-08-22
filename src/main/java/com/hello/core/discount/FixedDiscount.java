package com.hello.core.discount;

import com.hello.core.domain.Grade;
import com.hello.core.domain.Member;

public class FixedDiscount implements DiscountPolicy{

    // 1000원 정률할인
    private final int discount = 1000;

    @Override
    public int discount(Member member, int price) {
        Grade grade = member.getGrade();

        if(Grade.VIP.equals(grade)){
            return price - discount;
        }
        return price;
    }

}
