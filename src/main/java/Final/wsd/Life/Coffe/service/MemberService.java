package Final.wsd.Life.Coffe.service;

import Final.wsd.Life.Coffe.member.Member;
import Final.wsd.Life.Coffe.member.MemberRepository;
import Final.wsd.Life.Coffe.member.MemoryMemberRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Transactional

public class MemberService{
    private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){
            this.memberRepository = memberRepository;
        }
        //SignIn Member

        public long join(Member member){
            validDuplicateMember(member);
            memberRepository.save(member);
            return member.getId();
        }

        private void validDuplicateMember(Member member) {
            Optional<Member> result = memberRepository.findByName(member.getName());
            result.ifPresent(m -> {
                throw new IllegalStateException("You are already a member ");
            });
        }

        public List<Member> findMember(){
            return memberRepository.findAll();
        }

        public Optional<Member> findOne(Long memberId){
            return memberRepository.findById(memberId);
        }
    }


