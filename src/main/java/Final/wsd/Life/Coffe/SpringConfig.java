package Final.wsd.Life.Coffe;


import Final.wsd.Life.Coffe.member.MemberRepo;
import Final.wsd.Life.Coffe.member.MemberRepository;
import Final.wsd.Life.Coffe.member.MemoryMemberRepository;
import Final.wsd.Life.Coffe.service.MemberService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    //private final MemberRepository memberRepository;
    private final MemberRepo memberRepository;

    /*public SpringConfig(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

     */

    public SpringConfig(MemberRepo memberRepository) {
    this.memberRepository = memberRepository;
    }

    // private DataSource dataSource;
    //  private final EntityManager em;

    /*public SpringConfig(DataSource dataSource, EntityManager em) {
        this.dataSource = dataSource;
        this.em = em;
        }
        */


//    @Bean
//    public MemberService memberService() {
//        return new MemberService((memberRepository));
//    }

   /* @Bean
    public MemberRepository memberRepository() {
        return new JpaMemberRepository(em);
       // return new JdbcTemplateMemberRepository(dataSource);
        //return new JdbcMemberRepository(dataSource);

    */
}
