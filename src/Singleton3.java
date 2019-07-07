//双检锁/双重校验锁。DCL，即 double-checked locking
public class Singleton3 {
    private Singleton3(){}
    private static Singleton3 instance;
    public static Singleton3 getInstance(){
        if(instance == null){
            synchronized (Singleton3.class){
                if(instance == null){
                    instance = new Singleton3();
                }
            }
        }
        return instance;
    }
}
