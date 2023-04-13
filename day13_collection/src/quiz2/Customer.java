package quiz2;

import java.util.ArrayList;

public class Customer {
	private String name, address, tel;
	
	public Customer() {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public Customer(String name, String address, String tel) {
		this.name = name;
		this.address = address;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n주소 : " + address + "\n번호 : " + tel + "\n";
	}
	
}

















