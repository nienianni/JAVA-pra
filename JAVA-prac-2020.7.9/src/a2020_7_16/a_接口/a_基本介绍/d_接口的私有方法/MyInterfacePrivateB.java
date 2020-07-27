package a2020_7_16.a_接口.a_基本介绍.d_接口的私有方法;

public interface MyInterfacePrivateB {

    public static void methodStatic1() {
        System.out.println("静态方法1");
        methodStaticCommon();
    }

    public static void methodStatic2() {
        System.out.println("静态方法2");
        methodStaticCommon();
    }

    private static void methodStaticCommon() {//加了private就只有methodStatic1()、methodStatic2()能够访问，其他实现类就不行。
        System.out.println("AAA");
        System.out.println("BBB");
        System.out.println("CCC");
    }

}
