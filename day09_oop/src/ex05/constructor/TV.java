package ex05.constructor;

public class TV {
	private String color;
	private int channel;
	
	//생성자 함수 : 멤버변수의 초기화가 목적이다.
	public TV() {
		channel = 17;
		color = "black";
	}
	
	public TV(String color, int channel) { // 매개변수 2개인 생성자 함수
		this.color = color;
		this.channel = channel;
	}
	
	public TV(String color) {
		this.color = color;
	}
	
	public TV(int channel) { // 매개변수 1개 생성자 함수
		this.channel = channel;
		color = "red";
	}
	
	// getter / setter method 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	public void output() {
		System.out.print("선택한 TV의 색상과 채널은 ");
		System.out.println(color + "계열의 색상과 " + channel + "번입니다");
	}
}
