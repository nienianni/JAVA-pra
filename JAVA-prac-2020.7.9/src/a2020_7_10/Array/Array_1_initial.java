package a2020_7_10.Array;
/*
数组：
1.是一种引用数据类型；
2.数组长度不可改变

初始化数组：在内存当中创建一个数组，并向其中赋予一些默认值
两种常见方式：
1.动态初始化（指定长度）
2.静态初始化（指定内容）

动态格式：
数据类型[] 数组名称 = new 数据类型[数组长度];
静态格式：
数据类型[] 数组名称 = new 数据类型[]{元素1，元素2，...};

注意事项：
1.静态初始化的标准格式和动态初始化都可以拆分成两个步骤。
*/

public class Array_1_initial {
    public static void main(String[] args) {
        //以下为动态：
        int[] arrayA=new int[300];
        double[] arrayB=new double[10];
        String[] arrayC=new String[20];
        //以下为静态标准格式：
        int[] arrayD=new int[]{1,2,3,4};
        String[] arrayE=new String[]{"la","la","la"};
        //以下为静态的省略格式：
        int[] arrayF={10,20,30};


        //以下为拆分：
        int[] arrayG;
        arrayG=new int[20];
        int[] arrayH;
        arrayH=new int[]{1,2,3,4};
    }
}

//以下为静态：
