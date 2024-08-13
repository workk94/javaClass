package day09.ex;

public class OrderTest {

	public static void main(String[] args) {
		Order order = new Order();
		order.orderId = "201803120001";
		order.userId = "abc123";
		order.orderDate = "2018년3월12일";
		order.userName = "홍길순";
		order.productId = "D0345-12";
		order.shippingAddress = "서울시 영등포구 여의도동 20번지";
		
		
		System.out.println("주문번호 : " + order.orderId);
		System.out.println("주문자아이디 : " + order.userId);
		System.out.println("주문날짜 : " + order.orderDate);
		System.out.println("주문자이름 : " + order.userName);
		System.out.println("주문상품번호 : " + order.productId);
		System.out.println("배송주소 : " + order.shippingAddress);
	}

}
