package singleton;

//懒汉式：线程不安全
public class Singleton1 {
    private Singleton1(){}
    private static Singleton1 instance;
    public static Singleton1 getInstance(){
        if(instance == null){
            instance = new Singleton1();
        }
        return instance;
    }
}
