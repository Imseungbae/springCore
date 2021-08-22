package com.hello.core.service;

import com.hello.core.domain.Member;
import com.hello.core.domain.Order;

public interface OrderService {

    Order CreateOrder(Long memberId, String itemName, int itemPrice);
}
