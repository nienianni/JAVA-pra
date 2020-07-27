package a2020_7_16.a_接口.b_继承父类并实现多个接口.注意事项5;

public interface MyInterface {

    public default void method() {
        System.out.println("接口的默认方法");
    }

}
