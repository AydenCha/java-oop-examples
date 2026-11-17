package com.codeit.lecture.p41.ex01;

// 파일 이름: Main.java
class Outer { // 외부 클래스
	class Inner {
		void hello() {
			System.out.println("내부 클래스의 메서드입니다.");
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Outer outer = new Outer();
		Outer.Inner inner = outer.new Inner();
		inner.hello();
	}
}
