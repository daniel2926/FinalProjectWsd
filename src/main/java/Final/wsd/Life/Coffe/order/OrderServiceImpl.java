package Final.wsd.Life.Coffe.order;

import Final.wsd.Life.Coffe.discount.DiscountPolicy;
import Final.wsd.Life.Coffe.member.Member;

public class OrderServiceImpl implements OrderService {

    private final MemberRepository memberRepository;
    private final DiscountPolicy discountPolicy;

    public OrderServiceImpl(MemberRepository memberRepository, DiscountPolicy discountPolicy) {
        this.memberRepository = memberRepository;
        this.discountPolicy = discountPolicy;
    }

    @Override
    public Order creatOrder(String size, String itemName, int price) {
        Member member = memberRepository.findByID(memberId);
        return null;
    }
}
