package com.hello.core;

import com.hello.core.domain.Grade;
import com.hello.core.domain.Member;
import com.hello.core.service.MemberService;
import com.hello.core.service.MemberServiceImpl;

public class memberApp {

    public static void main(String[] args) {

        AppConfig appConfig = new AppConfig();

        MemberService memberService = appConfig.memberService();

        Member member = new Member(1L, "isb", Grade.BASIC);

        memberService.save(member);

        memberService.findById(member.getId());

        System.out.println("memberName = " + member.getName());

    }

}
