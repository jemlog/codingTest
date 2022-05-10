package example;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class HelloServiceImpl implements HelloService{


    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        // 인터페이스에서 static으로 구현한건, 그냥 인터페이스에서 바로 사용 가능하다!
        System.out.println(HelloService.bye());
        HelloService helloService = new HelloServiceImpl();
        // 인터페이스에서 default로 구현한건 무조건 인스턴스를 통해 써야 한다.
        System.out.println(helloService.hi());
        // 선언만 해놓은건 오버라이딩 해서 사용 가능하다.
        System.out.println(helloService.hello());

        Class<?> aClass = Class.forName("example.Font");
        Constructor<?> constructor = aClass.getConstructor(); // 강제로 기본 생성자 호출해줌!
        Font o = (Font) constructor.newInstance();

    }

    @Override
    public String hello() {
        return "hello";
    }


}
