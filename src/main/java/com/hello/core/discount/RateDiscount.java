package com.hello.core.discount;

import com.hello.core.domain.Grade;
import com.hello.core.domain.Member;

public class RateDiscount implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP){
            return price*discountPercent/100;
        }
        return price;
    }
}
