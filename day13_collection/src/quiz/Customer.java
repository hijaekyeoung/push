package quiz;

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
	
	public void addCustomer(ArrayList list, Customer c) {
		list.add(c);
	}
	
	public void removeList(ArrayList list, Customer c) {
		list.remove(c);
	}
	
	public void printList(ArrayList list) {
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i) + " ");
		}
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + "\n주소 : " + address + "\n번호 : " + tel + "\n";
	}
	
	// 전화번호 변경
	public void updateList(ArrayList list,int index,Customer c) {
		list.set(index, new Customer(name, address, tel));
	}
	
	public void exit() {
		System.exit(0);
	}
}

















