package com.codeit.classlecture.FieldExampleV1;

public class StaticExampleV2 {
    public static void main(String[] args) {
        // 클래스 변수는 객체를 만들지 않고 클래스 이름으로 바로 씁니다.
        System.out.println(StaticExampleV1.classVariable);

        // 인스턴스 변수는 클래스 이름으로 쓸 수 없습니다. 아래 줄의 주석을 풀면 컴파일 에러가 납니다.
        // System.out.println(StaticExampleV1.instanceVariable);

        // 인스턴스 변수는 객체를 만든 뒤 객체를 통해 씁니다.
        StaticExampleV1 example = new StaticExampleV1();
        System.out.println(example.instanceVariable);

        StaticExampleV1.classMethod();
        example.instanceMethod();
    }
}
