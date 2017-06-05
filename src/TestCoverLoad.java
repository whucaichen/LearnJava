class Aball {
    Aball() {
    }

    void method() {
        System.out.println("method of Aball");
    }

    static void staticmethod() {
        System.out.println("staticmethod of Aball");
    }
}

public class TestCoverLoad extends Aball {
    TestCoverLoad() {
    }

    void method() {// 覆盖父类的方法
        System.out.println("method of ExtendsMethod");
    }

    static void staticmethod() {// 重载类中的方法
        System.out.println("staticmethod of ExtendsMethod");
    }

    public static void main(String[] args) {
        Aball sub1 = new TestCoverLoad();
        TestCoverLoad sub2 = new TestCoverLoad();
        sub1.method();
        sub1.staticmethod();
        sub2.method();
        sub2.staticmethod();
/**
 引用变量sub1和sub2都引用ExtendsMethod类的实例，执行sub1.method()和sub2.method()时，都调用ExtendsMethod实例的method()方法，此时父类Aball的实例方法method()被子类覆盖。
 引用变量sub1被声明为Aball类型，执行sub1.staticmethod()时，调用Aball类的staticmethod()方法，说明父类的静态方法不能被子类覆盖。
 引用变量sub2被声明为ExtendsMethod类型，执行sub2.staticmethod()时，调用ExtendsMethod类的staticmethod()方法，说明父类的静态方法被子类的静态方法隐藏了。
 */
    }
}