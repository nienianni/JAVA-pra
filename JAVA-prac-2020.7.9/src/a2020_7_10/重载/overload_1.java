package a2020_7_10.重载;
/*
重载：多个方法名称一样，但参数列表不一样
其不一样表现在：
1.参数个数不同
2.参数类型不同
3.参数的多类型顺序不同

以下情况不能实现重载：
1.参数名称不一致（一个为a,b;一个为x,y),不算
2.参数的返回值类型不一致
3.
示例如下
* */
public class overload_1 {
    public static void main(String[] args)
    {
        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,30,40));

    }
    public static int sum(int a,int b)
    {
        return a+b;
    }
    public static int sum(int a,int b,int c)
    {
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d)
    {
        return a+b+c+d;
    }
}

