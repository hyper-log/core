package hello.core.singleton;

public class SingletonService {

    // static 영역에 객체를 딱 하나만 생성
    private static final SingletonService instance = new SingletonService();

    //이 static 메서드를 통해서만 호출
    public static SingletonService getInstance() {
        return  instance;
    }

    //외부에서 new 하지 못하도록
    private SingletonService() {

    }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }
}
