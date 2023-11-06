package Final.wsd.Life.Coffe.service;

import Final.wsd.Life.Coffe.member.Member;
import Final.wsd.Life.Coffe.member.MemoryMemberRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MemberServiceTest {

    MemberService memberService;
    MemoryMemberRepository memberRepository ;

    @Test
    void join(){
        Member member = new Member();
        member.setName("Daniel");
        Long saveId = memberService.join(member);
        Member findMember = memberRepository.findById(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public  void DuplicateMemberException() throws Exception {
        //given
        Member member1 = new Member();
        member1.setName("spring");
        Member member2 = new Member();
        member2.setName("spring");

        //when
        memberService.join(member1);
        IllegalStateException ex = assertThrows(IllegalStateException.class, () -> memberService.join(member2));
        Assertions.assertThat(ex.getMessage()).isEqualTo("You are already a member");

    }

}
