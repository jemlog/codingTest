package example;

public interface HelloService {

    /*
    모두 퍼블릭한 필드만 가져야 한다.
    프라이빗은 오직 정적 메서드만 가능하다!
     */

    // 인터페이스에서는 접근 지시자 생략 되어있으면 public이다.
    String hello(); // 메서드 선언

    // 인스턴스에만 호출할 수 있는 메서드 : default
    default String hi(){
      return "hi";
    };

    // 인스턴스 만들지 않고 사용!
    static String bye()
    {
        pripare();
        return "bye";
    }

    static private void pripare()
    {
        System.out.println("pripare");
    }
}
