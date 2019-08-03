package singleton;

//登记式，静态内部类,推荐
public class Singleton5 {
    private static class SingletonHolder{
        private static final Singleton5 instance = new Singleton5();
    }
    private Singleton5(){}
    public static Singleton5 getInstance(){
        return SingletonHolder.instance;
    }
}
