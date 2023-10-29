package Final.wsd.Life.Coffe.discount;

import java.lang.reflect.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
