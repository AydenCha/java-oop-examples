package com.codeit.classlecture.MethodExample;

public class MethodExampleV2 {
    public static void main(String[] args) {
        // MethodExampleV1의 메서드는 static이 아니므로 객체를 만든 뒤 객체를 통해 호출합니다.
        // MethodExampleV1.getNumSeven()처럼 클래스 이름으로 호출하면 컴파일 에러가 납니다.
        MethodExampleV1 example = new MethodExampleV1();

        System.out.println(example.getNumSeven());
        System.out.println(example.multiply(2, 4));

        // printString()과 printParameterString()은 반환 타입이 void라서 돌려주는 값이 없습니다.
        // 그래서 System.out.println(...) 안에 넣지 않고 그대로 호출합니다. (넣으면 컴파일 에러가 납니다)
        example.printString();
        example.printParameterString("ABCDE...Z");
    }
}
