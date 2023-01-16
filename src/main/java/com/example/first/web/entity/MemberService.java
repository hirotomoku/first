package com.example.first.web.entity;

import com.example.first.web.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MemberService {
    private final MemberRepository memberRepository;
    public List<MemberEntity> findAll(){
        return memberRepository.findAll();
    }
}
