package open_closed_principle.correct;

public class VipDiscountPolicy implements DiscountPolicy {
    public int discount(int price) {
        return price * 20 / 100;
    }
}
