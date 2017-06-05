package cc.chance.jni;

/**
 * Created by Chance on 17/03/22.
 */
public class JNIDemo {
    public native void sayHello();

    public static void main(String[] args) {
        System.loadLibrary("JNIDemo");
        JNIDemo jniDemo = new JNIDemo();
        jniDemo.sayHello();
    }
}
