package com.hello.core.repository;

import com.hello.core.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository{

    private static Map<Long, Member> memberStore = new HashMap<>();

    @Override
    public void save(Member member) {
        memberStore.put(member.getId(), member);
    }

    @Override
    public Member findById(Long id) {
        return memberStore.get(id);
    }
}
