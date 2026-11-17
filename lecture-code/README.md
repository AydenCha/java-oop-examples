# lecture-code

교안 "객체지향 프로그래밍의 이해"(수강생용)에 실린 코드 중 그대로 실행할 수 있는 예제를 페이지별로 모았습니다.
교안의 코드와 같은 내용이며, 각 페이지 위쪽에 이 폴더의 위치를 적어 두었습니다.

## 실행 방법

1. IntelliJ에서 `lecture-code` 폴더를 프로젝트로 엽니다(JDK 21).
2. 아래 표에서 보고 있는 교안 페이지의 폴더를 찾아, 예제 파일의 `main` 메서드를 실행합니다.

터미널에서는 `./gradlew build`로 전체를 컴파일할 수 있습니다.

## 교안 페이지와 폴더

| 교안 페이지 | 폴더 (`src/main/java/com/codeit/lecture/`) |
|---|---|
| 1. 객체지향 프로그래밍의 개념과 필요성 | `p01/` (예제 6개: ex01, ex02, ex03, ex04, ex05, ex06) |
| 클래스와 객체 | `p02/` (예제 2개: ex01, ex02) |
| 객체의 생성과 활용 | `p03/` (예제 4개: ex01, ex02, ex03, ex04) |
| 필드(Field) | `p04/` (예제 4개: ex01, ex02, ex03, ex04) |
| static 키워드 | `p05/` (예제 6개: ex01, ex02, ex03, ex04, ex05, ex06) |
| 메서드(Method) | `p06/` (예제 6개: ex01, ex02, ex03, ex04, ex05, ex06) |
| 생성자(Constructor) | `p07/` (예제 5개: ex01, ex02, ex03, ex04, ex05) |
| this vs this() | `p08/` (예제 2개: ex01, ex02) |
| JVM 구조 | `p10/` (예제 2개: ex01, ex02) |
| Garbage Collection (GC) | `p11/` (예제 3개: ex01, ex02, ex03) |
| 메모리 누수 방지 방법 (Memory Leak Prevention) | `p12/` (예제 4개: ex01, ex02, ex03, ex04) |
| 상속(Inheritance)이란 | `p13/` (예제 5개: ex01, ex02, ex03, ex04, ex05) |
| 포함 관계 (Composition) | `p14/` (예제 4개: ex01, ex02, ex03, ex04) |
| 메서드 오버라이딩 (Method Overriding) | `p15/` (예제 4개: ex01, ex02, ex03, ex04) |
| super, super() | `p16/` (예제 2개: ex01, ex02) |
| 최상위 클래스, Object 클래스 | `p17/` (예제 3개: ex01, ex02, ex03) |
| 접근 제어자 (Access Modifier) | `p19/` (예제 1개: ex01) |
| Getter와 Setter 메서드 | `p20/` (예제 2개: ex01, ex02) |
| 패키지 (Package) | `p21/` (예제 1개: ex01) |
| 불변 객체(Immutable Object) | `p22/` (예제 2개: ex01, ex02) |
| Java Bean 규약 | `p23/` (예제 1개: ex01) |
| 다형성(Polymorphism) | `p24/` (예제 4개: ex01, ex02, ex03, ex04) |
| 참조 변수의 타입 변환(up-casting, down-casting) | `p25/` (예제 2개: ex01, ex02) |
| instanceof 연산자 | `p26/` (예제 2개: ex01, ex02) |
| 다형성의 활용 예제 | `p27/` (예제 2개: ex01, ex02) |
| 추상화 | `p28/` (예제 2개: ex01, ex02) |
| abstract 제어자 | `p29/` (예제 2개: ex01, ex02) |
| 추상 클래스 | `p30/` (예제 2개: ex01, ex02) |
| final 키워드 | `p31/` (예제 2개: ex01, ex02) |
| 인터페이스 | `p32/` (예제 7개: ex01, ex02, ex03, ex04, ex05, ex06, ex07) |
| 추상 클래스 vs 인터페이스: 선택 기준과 활용 전략 | `p33/` (예제 4개: ex01, ex02, ex03, ex04) |
| SRP(Single Responsibility Principle) | `p34/` (예제 1개: ex01) |
| OCP (Open/Closed Principle) | `p35/` (예제 2개: ex01, ex02) |
| 전략 패턴 예시 | `p36/` (예제 1개: ex01) |
| LSP (Liskov Substitution Principle) | `p37/` (예제 4개: ex01, ex02, ex03, ex04) |
| ISP (Interface Segregation Principle) | `p38/` (예제 3개: ex01, ex02, ex03) |
| DIP (Dependency Inversion Principle) | `p39/` (예제 3개: ex01, ex02, ex03) |
| 퀴즈 | `p40/` (예제 2개: ex01, ex02) |
| 내부 클래스(Inner Class) | `p41/` (예제 7개: ex01, ex02, ex03, ex04, ex05, ex06, ex07) |
| 멤버 내부 클래스 | `p42/` (예제 2개: ex01, ex02) |
| 지역 내부 클래스 | `p43/` (예제 2개: ex01, ex02) |
| 익명 클래스(Anonymous Class) | `p44/` (예제 2개: ex01, ex02) |
| Enum의 개념과 필요성 | `p45/` (예제 7개: ex01, ex02, ex03, ex04, ex05, ex06, ex07) |
| Enum 정의 및 기본 사용법 | `p46/` (예제 6개: ex01, ex02, ex03, ex04, ex05, ex06) |
| Enum에 필드, 생성자, 메서드 추가하기 | `p47/` (예제 5개: ex01, ex02, ex03, ex04, ex05) |
| Switch 문과 Enum 활용 | `p48/` (예제 8개: ex01, ex02, ex03, ex04, ex05, ex06, ex07, ex08) |
| Enum 사용 시 고려사항 및 베스트 프랙티스 | `p49/` (예제 5개: ex01, ex02, ex03, ex04, ex05) |
| 예외의 개념과 필요성 | `p50/` (예제 2개: ex01, ex02) |
| 체크드 예외 (Checked Exception)와 언체크드 예외 (Unchecked Exception) | `p51/` (예제 1개: ex01) |
| 예외 처리 문법 | `p52/` (예제 6개: ex01, ex02, ex03, ex04, ex05, ex06) |
| 예외 처리 시 고려사항 및 베스트 프랙티스 | `p53/` (예제 7개: ex01, ex02, ex03, ex04, ex05, ex06, ex07) |
| 클래스 다이어그램 (Class Diagram) | `p55/` (예제 1개: ex01) |
| 시퀀스 다이어그램 (Sequence Diagram) | `p56/` (예제 1개: ex01) |
