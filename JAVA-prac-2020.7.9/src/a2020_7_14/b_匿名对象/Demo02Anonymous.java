package a2020_7_14.b_匿名对象;

import java.util.Scanner;

public class Demo02Anonymous {

    public static void main(String[] args) {
        // 普通使用方式
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();

        // 匿名对象的方式
//        int num = new Scanner(System.in).nextInt();
//        System.out.println("输入的是：" + num);

        // 使用一般写法传入参数
//        Scanner sc = new Scanner(System.in);
//        methodParam(sc);

        // 使用匿名对象来进行传参
//        methodParam(new Scanner(System.in));

        Scanner sc = methodReturn();//获取一个scanner对象
        int num = sc.nextInt();//调用其成员方法
        System.out.println("输入的是：" + num);
    }

    public static void methodParam(Scanner sc) {//定义方法methodParam
        int num = sc.nextInt();
        System.out.println("输入的是：" + num);
    }

    public static Scanner methodReturn() {//定义方法methodReturn
//        Scanner sc = new Scanner(System.in);
//        return sc;
        return new Scanner(System.in);
    }

}
