package com.hello.core.service;
import com.hello.core.discount.DiscountPolicy;
import com.hello.core.discount.FixedDiscount;
import com.hello.core.discount.RateDiscount;
import com.hello.core.domain.Member;
import com.hello.core.domain.Order;
import com.hello.core.repository.MemberRepository;
import com.hello.core.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{

    private DiscountPolicy discountPolicy;
    private MemberRepository memberRepository;

    public OrderServiceImpl(DiscountPolicy discountPolicy, MemberRepository memberRepository) {
        this.discountPolicy = discountPolicy;
        this.memberRepository = memberRepository;
    }

    @Override
    public Order CreateOrder(Long memberId, String itemName, int itemPrice) {

        Member member = memberRepository.findById(memberId);
        int discountPrice = discountPolicy.discount(member, itemPrice);

        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}