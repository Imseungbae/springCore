package com.hello.core.service;

import com.hello.core.domain.Member;

public interface MemberService {

    public void save(Member member);

    public Member findById(Long id);
}
