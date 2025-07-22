package open_closed_principle.violation;

public class Main {
    public static void main(String[] args) {
        System.out.println(calculateDiscount("VIP", 10000));
    }

    /*
     * 이 코드를 봤을 떄 만약 grade 중 silver라는 내용이 추가된다면 해당 메소드를 수정해야 한다.
     * 기능 확장 시 매번 코드를 추가해야되는 번거로움이 생긴다.
     */
    public static int calculateDiscount(String grade, int price) {
        if (grade.equals("VIP")) {
            return price * 20 / 100;
        } else if (grade.equals("GOLD")) {
            return price * 10 / 100;
        } else {
            return 0;
        }
    }
}
