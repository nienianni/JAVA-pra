package a2020_7_16.a_接口.a_基本介绍.d_接口的私有方法;

public class MyInterfacePrivateAImpl implements MyInterfacePrivateA {

    public void methodAnother() {
        // 直接访问到了接口中的默认方法，这样是错误的！
//        methodCommon();
    }

}
