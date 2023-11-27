package Final.wsd.Life.Coffe.order;

import Final.wsd.Life.Coffe.member.Member;

import java.util.List;

public interface OrderService {
    Order creatOrder(Long MemberId,String size, String itemName, int price);
    public List<Member> getAllCoffee();
}
