package singleton;

//饿汉式：线程安全，但会造成内存浪费
public class Singleton4 {
    private Singleton4(){};
    private static Singleton4 instance = new Singleton4();
    public static Singleton4 getInstance(){
        return instance;
    }
}
