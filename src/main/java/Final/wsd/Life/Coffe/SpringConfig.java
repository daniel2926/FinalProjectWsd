package Final.wsd.Life.Coffe;


import Final.wsd.Life.Coffe.member.MemberRepository;
import Final.wsd.Life.Coffe.member.MemoryMemberRepository;
import Final.wsd.Life.Coffe.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberService memberService(){

        return new MemberService(memberRepository());
    }

    @Bean
    public MemberRepository memberRepository(){

        return new MemoryMemberRepository();
    }

}
