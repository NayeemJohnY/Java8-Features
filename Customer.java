package java8Features;

import java.util.HashSet;
import java.util.Set;

public class Customer {

	private String name;
	private int age;
	private Set<String> devices;

	public Set<String> getDevices() {
		return devices;
	}

	public void setDevices(Set<String> devices) {
		this.devices = devices;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void addDevics(String device) {
	 if (this.devices == null) {
		this.devices = new HashSet<>();
	}
	  this.devices.add(device);
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
