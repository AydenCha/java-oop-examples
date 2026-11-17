package com.codeit.lecture.p23.ex01;

// 파일 이름: Main.java
import java.io.Serializable;

class UserDTO implements Serializable {

	private String id;
	private String pwd;
	private String name;
	private java.util.Date enrollDate;

	public UserDTO() {}

	public UserDTO(String id, String pwd, String name, java.util.Date enrollDate) {
		this.id = id;
		this.pwd = pwd;
		this.name = name;
		this.enrollDate = enrollDate;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEnrollDate(java.util.Date enrollDate) {
		this.enrollDate = enrollDate;
	}

	public String getId() {
		return id;
	}

	public String getPwd() {
		return pwd;
	}

	public String getName() {
		return name;
	}

	public java.util.Date getEnrollDate() {
		return enrollDate;
	}

	public String getInformation() {
		return "UserDTO [id=" + this.id + ", pwd=" + this.pwd + ", name=" + this.name + ", enrollDate=" + this.enrollDate + "]";
	}
}

public class Main {
	public static void main(String[] args) {
		UserDTO user1 = new UserDTO();
		user1.setId("user01");
		user1.setPwd("pass01");
		user1.setName("김코딩");
		System.out.println(user1.getInformation());

		// 2. 매개변수 있는 생성자로 한 번에 채우는 방법
		UserDTO user2 = new UserDTO("user02", "pass02", "박해커", null);
		System.out.println(user2.getName()); // 박해커
	}
}
