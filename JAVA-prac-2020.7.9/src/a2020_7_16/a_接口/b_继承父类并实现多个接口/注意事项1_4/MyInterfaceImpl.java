package a2020_7_16.a_接口.b_继承父类并实现多个接口.注意事项1_4;

//(2)一个类的直接父类是唯一的，但是一个类可以同时实现多个接口


public class MyInterfaceImpl /*extends Object*/ implements MyInterfaceA, MyInterfaceB {

    @Override
    public void methodA() {
        System.out.println("覆盖重写了A方法");
    }

    @Override
    public void methodB() {
        System.out.println("覆盖重写了B方法");
    }



//(3)如果实现类所实现的多个接口当中，存在重复的抽象方法，那么只需要覆盖重写一次即可。
    @Override
    public void methodAbs() {
        System.out.println("覆盖重写了AB接口都有的抽象方法");
    }
//(5)如果实现类锁实现的多个接口当中，存在重复的默认方法，那么实现类一定要对冲突的默认方法进行覆盖重写。
    @Override
    public void methodDefault() {
        System.out.println("对多个接口当中冲突的默认方法进行了覆盖重写");
    }

}
