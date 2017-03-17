package test.hcm.com.testapplication;

/**
 * 项目名SIM+Coffee-Android客户端
 * Created by ${huchengming} on 2017-02-23.
 */

public class MyJNI {
  static {
      System.loadLibrary("JNITest");
  }
  public static native String sayHello();
}
