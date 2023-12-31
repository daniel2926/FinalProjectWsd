package Final.wsd.Life.Coffe.controller;

import Final.wsd.Life.Coffe.controller.MemberForm;
import Final.wsd.Life.Coffe.member.Member;
import Final.wsd.Life.Coffe.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MemberController {
    private final MemberService memberService;

    @Autowired
    public MemberController(MemberService memberService){
        this.memberService = memberService;
    }

    @GetMapping("/members/new")
    public String createForm(){
        return "member/createMemberForm";
    }

    @PostMapping(value ="/members/new")
    public String create(MemberForm form){
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }

    @GetMapping(value ="/members")
    public String list(Model model){
        List <Member> members = memberService.findMembers();
        model.addAttribute("members",members);
        return "member/memberList";
    }
}
