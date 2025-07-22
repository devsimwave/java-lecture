package open_closed_principle.correct;

public class GoldDiscountPolicy implements DiscountPolicy {
    public int discount(int price) {
        return price * 10 / 100;
    }
}
