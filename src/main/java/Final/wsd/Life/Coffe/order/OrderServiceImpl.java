package Final.wsd.Life.Coffe.order;

import Final.wsd.Life.Coffe.member.Member;
import Final.wsd.Life.Coffe.member.SpringDataJpaMemberRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service

public class OrderServiceImpl implements OrderService{

    private SpringDataJpaMemberRepository memberRepository;

    public OrderServiceImpl(SpringDataJpaMemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Override
    public Order creatOrder(Long memberId,String size, String itemName, int price) {
        Optional<Member> member = memberRepository.findById(memberId);
        return new Order(memberId,size,itemName,price);
    }
    @Override
    public List<Member>getAllCoffee(){
        return memberRepository.findAll();
    }
}

