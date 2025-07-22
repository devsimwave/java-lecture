package open_closed_principle.correct;

public class Main {
    /* 개방 폐쇄 원칛(Open Closed Principle) 이란
        소프트웨어 요소(클래스, 모듈, 함수 등)는 확장에는 열령 있어야 하고, 변경에는 닫혀 있어야 한다.
        즉, 기존 코드를 변경하지 않고도 새로운 기능을 추가할 수 있도록 설계하라는 원칙이다.
        실제 운영 중인 코드에서는 기존 기능을 건드리면 버그가 생길 가능성이 크기 때문에 기존 코드는 건드리지 않고, 확장(새 기능 추가) 만으로 해결하는 것이 유지보수 측면에서 유리하다.
    */
    public static void main(String[] args) {
        int originalPrice = 10000;
        // VIP 할인 정책 적용
        DiscountPolicy vipPolicy = new VipDiscountPolicy();
        int vipDiscount = vipPolicy.discount(originalPrice);
        System.out.println("VIP 할인 금액: " + vipDiscount);

        // GOLD 할인 정책 적용
        DiscountPolicy goldPolicy = new GoldDiscountPolicy();
        int goldDiscount = goldPolicy.discount(originalPrice);
        System.out.println("GOLD 할인 금액: " + goldDiscount);


//        만약 Silver 할인 정책이 필요하면 DiscountPolicy를 상속받은 Silver관련 객체를 추가해서 기존 코드를 건드리지 않고 확장을 통해 개방 폐쇄 원칙을 적용할 수 있다.
//        DiscountPolicy silverPolicy = new SilverDiscountPolicy();
//        int silverDiscount = silverPolicy.discount(originalPrice);
//        System.out.println("SILVER 할인 금액: " + silverDiscount);
    }
}
