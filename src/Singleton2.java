//懒汉式：线程安全但效率低
public class Singleton2 {
    private Singleton2(){}
    private static Singleton2 instance;
    public static Singleton2 getInstance(){
        synchronized (Singleton2.class){
            if(instance == null){
                instance = new Singleton2();
            }
            return instance;
        }
    }
}
