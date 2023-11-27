//package Final.wsd.Life.Coffe;
//
//
//import Final.wsd.Life.Coffe.member.MemberRepository;
//import Final.wsd.Life.Coffe.member.MemoryMemberRepository;
//import Final.wsd.Life.Coffe.member.SpringDataJpaMemberRepository;
//import Final.wsd.Life.Coffe.order.OrderRepository;
//import Final.wsd.Life.Coffe.order.OrderService;
//import Final.wsd.Life.Coffe.order.OrderServiceImpl;
//import Final.wsd.Life.Coffe.service.MemberService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
//@Configuration
//public class SpringConfig {
//    private final SpringDataJpaMemberRepository memberRepository;
//
//    public SpringConfig(SpringDataJpaMemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//
//    @Bean
//    public OrderService orderService() {
//        // 1 time
//        System.out.println("call AppCongif.orderService");
//        return new OrderServiceImpl(member);
//        //return null;
//    }
//
//    @Bean
//    public MemberRepository memberRepository() {
//        // 2 times or 3 times?
//        System.out.println("call AppCongif.memberRepository");
//        return new MemoryMemberRepository();
//    }
//    @Bean
//    public MemberService memberService() {
//        return new MemberService((memberRepository));
//    }
//}
//
