package Final.wsd.Life.Coffe.discount;

public class FixDiscountPolicy {

    private int discountFixAmountSilver = 7500;
    private int discountFixAmountGOLD = 12500;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.SILVER){
            return discountFixAmountSilver;
        } else {
            return 0;
        }
    }
    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.GOLD){
            return discountFixAmountGOLD;
        } else {
            return 0;
        }
    }

}
