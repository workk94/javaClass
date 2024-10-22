package day10.객체배열;

public class Latte {
	//멤버 클래스변수 
    private static int 카페라떼 = 4500;  // 기본 카페라떼 가격
    private static int 샷추가 = 500; // 샷 추가 가격
    private static int 바닐라시럽추가 = 500; // 바닐라 시럽 추가 가격
    private static int 사이즈업 = 1500; // 사이즈 업 가격
  
    
    // 각 항목의 수량
    
    //멤버변수
    //멤버 인스턴스 변수
    private int 카페라떼수량;
    private int 샷추가수량;
    private int 바닐라시럽추가수량;
    private int 사이즈업수량;
    private int 합계금액 = 0;
    
    public void input(int 카페라떼수량, int 샷추가수량, int 바닐라시럽추가수량, int 사이즈업수량) {
        this.카페라떼수량 = 카페라떼수량;
        this.샷추가수량 = 샷추가수량;
        this.바닐라시럽추가수량 = 바닐라시럽추가수량;
        this.사이즈업수량 = 사이즈업수량;
    }
    public void calcTotal() {
        합계금액 = (카페라떼 * 카페라떼수량) + (샷추가 * 샷추가수량) + (바닐라시럽추가 * 바닐라시럽추가수량) + (사이즈업 * 사이즈업수량);
    }
    public void printInfo() {
        System.out.println("카페라떼 : " + 카페라떼수량 + "잔");
        System.out.println("샷 추가 : " + 샷추가수량+"번");
        System.out.println("바닐라 시럽 추가 : " + 바닐라시럽추가수량 + "번");
        System.out.println("사이즈 업 : " + 사이즈업수량+"번");
        System.out.println("합계 금액 : " + 합계금액 + "원");
    }    
}
