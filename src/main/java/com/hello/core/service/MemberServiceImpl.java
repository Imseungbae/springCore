package com.hello.core.service;

import com.hello.core.domain.Member;
import com.hello.core.repository.MemberRepository;
import com.hello.core.repository.MemoryMemberRepository;

public class MemberServiceImpl implements MemberService{

//    MemberRepository memberRepository = new MemoryMemberRepository();
    private MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public void save(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findById(Long id) {
       return memberRepository.findById(id);
    }
}
