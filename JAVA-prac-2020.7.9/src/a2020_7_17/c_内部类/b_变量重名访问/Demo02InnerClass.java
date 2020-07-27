package a2020_7_17.c_内部类.b_变量重名访问;

public class Demo02InnerClass {

    public static void main(String[] args) {
        // 外部类名称.内部类名称 对象名 = new 外部类名称().new 内部类名称();
        Outer.Inner obj = new Outer().new Inner();
        obj.methodInner();
    }

}
