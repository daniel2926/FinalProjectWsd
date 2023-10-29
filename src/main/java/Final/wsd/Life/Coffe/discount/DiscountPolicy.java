package Final.wsd.Life.Coffe.discount;


import Final.wsd.Life.Coffe.member.Member;

public interface DiscountPolicy {

    int discountSilver(Member member, int price);
    int discountGold(Member member, int price);
}
