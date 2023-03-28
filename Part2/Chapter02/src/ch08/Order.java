package ch08;

public class Order {
	
	public String orderNumber;
	public String phoneNumber;
	public String adress;
	public String orderDate;
	public String orderTime;
	public String price;
	public String menuNumber;
	
	public Order() { }
	
	public Order(
			String orderNumber, 
			String phoneNumber, 
			String adress, 
			String orderDate, 
			String orderTime, 
			String price, 
			String menuNumber
			) {
		this.orderNumber = orderNumber;
		this.phoneNumber = phoneNumber;
		this.adress = adress;
		this.orderDate = orderDate;
		this.orderTime = orderTime;
		this.price = price;
		this.menuNumber = menuNumber;
	}
	
	public void showOrderInfo() {
		System.out.println("==================");
		System.out.println("주문 접수 번호: " + orderNumber);
		System.out.println("주문 핸드폰 번호: " + phoneNumber);
		System.out.println("주문 주소: " + adress);
		System.out.println("주문 날짜: " + orderDate);
		System.out.println("주문 시간: " + orderTime);
		System.out.println("주문 가격: " + price);
		System.out.println("메뉴 번호: " + menuNumber);
		System.out.println("==================");
	}

}
