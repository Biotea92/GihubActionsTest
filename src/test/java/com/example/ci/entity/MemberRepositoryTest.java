package com.example.ci.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @Test
    void test() {
        Member newMember = new Member("WJ");
        memberRepository.save(newMember);

        Member member = memberRepository.findById(1L).get();

        System.out.println("size " + memberRepository.findAll().size());
        Assertions.assertEquals(newMember.getId(), member.getId());
    }
}