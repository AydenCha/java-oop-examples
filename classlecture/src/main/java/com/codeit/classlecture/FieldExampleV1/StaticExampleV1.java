package com.codeit.classlecture.FieldExampleV1;

public class StaticExampleV1 {
    // Static, 정적, 모든 객체와 메모리를 공유

    public String instanceVariable = "저는 인스턴스 변수입니다.";
    public static String classVariable = "저는 클래스 변수입니다.";

    public static void classMethod() {
        // static 메서드는 객체 없이 호출되므로, 어느 객체의 인스턴스 변수인지 알 수 없습니다.
        // 아래 줄의 주석을 풀면 컴파일 에러가 납니다.
        // (non-static variable instanceVariable cannot be referenced from a static context)
        // System.out.println(instanceVariable);
        System.out.println(classVariable);
    }

    public void instanceMethod() {
        // 인스턴스 메서드는 객체를 통해 호출되므로 인스턴스 변수와 클래스 변수를 모두 쓸 수 있습니다.
        System.out.println(instanceVariable);
        System.out.println(classVariable);
    }
}
