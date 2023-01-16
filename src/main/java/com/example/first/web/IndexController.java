package com.example.first.web;

import com.example.first.web.entity.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class IndexController {

    private final MemberService memberService;
    @GetMapping("/")//ルートディレクトリがGetで呼び出されたら
    public String index(){
        return "index";
    }

    @PostMapping("/serch")
    public String showList(Model model){
        model.addAttribute("memberList", memberService.findAll());
        return "memberList";
    }

}
