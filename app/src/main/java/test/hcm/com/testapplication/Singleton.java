package test.hcm.com.testapplication;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2017-03-04.
 */

public class Singleton {
    static Singleton instance=null;
    private Singleton(){

    }
    public static  Singleton getInstance(){
        if(instance ==null){
            synchronized (Singleton.class){
                if(instance ==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
