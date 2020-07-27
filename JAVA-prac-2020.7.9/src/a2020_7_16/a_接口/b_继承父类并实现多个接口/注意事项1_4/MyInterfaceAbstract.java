package a2020_7_16.a_接口.b_继承父类并实现多个接口.注意事项1_4;

//(4)该类没有重写接口中的所有方法，因为他自己也是一个抽象类

public abstract class MyInterfaceAbstract implements MyInterfaceA, MyInterfaceB {
    @Override
    public void methodA() {

    }

    @Override
    public void methodAbs() {

    }

    @Override
    public void methodDefault() {

    }


}
