package a2020_7_10.Array;
//反转就是对称位置交换
public class Array_2_reverse {
    public static void main(String[] args) {
        int[] arrayA={10,20,30};
        for(int i=0;i<arrayA.length;i++)
        {
            System.out.println(arrayA[i]);
        }

        for(int min=0,max=arrayA.length;min<max;min++,max++)
        {
            int temp=arrayA[min];
            arrayA[min]=arrayA[max];
            arrayA[max]=temp;
        }

    }
}
