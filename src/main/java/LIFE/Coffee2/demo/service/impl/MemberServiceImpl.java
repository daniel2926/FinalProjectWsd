//package LIFE.Coffee2.demo.service.impl;
//
//import LIFE.Coffee2.demo.entity.Member;
//import LIFE.Coffee2.demo.repository.MemberRepository;
//import LIFE.Coffee2.demo.service.MemberService;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class MemberServiceImpl implements MemberService {
//
//    private MemberRepository memberRepository;
//
//    public MemberServiceImpl(MemberRepository memberRepository) {
//        this.memberRepository = memberRepository;
//    }
//
//    @Override
//    public Member Register(Member member) {
//        ValidDuplicateEmail(member);
//        member.getMemberEmail();
//        member.getPassword();
//       return memberRepository.save(member);
//    }
//
//    @Override
//    public void ValidDuplicateEmail(Member member) {
//        Optional<Member> result = memberRepository.findByEmail(member.getMemberEmail());
//        result.ifPresent(m -> { throw new IllegalStateException("You are already a member");});
//    }
//
////    @Override
////    public Member Login(Member member) {
////        Optional<Member>result = memberRepository.findByEmail(member.getMemberEmail());
////        result.ifPresent(m -> );
////        return null;
////    }
//
//}
