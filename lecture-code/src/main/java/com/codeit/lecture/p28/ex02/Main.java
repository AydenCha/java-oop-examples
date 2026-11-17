package com.codeit.lecture.p28.ex02;

// 파일 이름: Main.java
class MemberDTO {

	private int number; // 회원번호
	private String name; // 회원명
	private int age; // 나이
	private char gender; // 성별
	private double height; // 키
	private double weight; // 몸무게
	private boolean isActivated; // 회원탈퇴여부(활성화여부)

	public void setNumber(int number) {
		this.number = number;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setActivated(boolean isActivated) {
		this.isActivated = isActivated;
	}

	public int getNumber() {
		return number;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public boolean isActivated() {
		return isActivated;
	}
}

public class Main {
	public static void main(String[] args) {
		MemberDTO member = new MemberDTO();

		// 설정자(setter)로 값을 넣고
		member.setNumber(1);
		member.setName("김코딩");
		member.setAge(20);
		member.setActivated(true);

		System.out.println(member.getNumber()); // 1
		System.out.println(member.getName()); // 김코딩
		System.out.println(member.getAge()); // 20
		System.out.println(member.isActivated()); // true
	}
}
