package Base;

import java.sql.SQLOutput;

public class nehance_for {
    public static void main(String[] args) {
        //增强for，c++也有
        int[] numbers={10,20,30,40,50};
        //遍历数组元素
        for(int x:numbers){
            System.out.println(x);
        }
        int num;
        //类似于goto，这是一个标签continue跳转至外层循环而不是内层
        outer:for(int i=101;i<150;i++){
            for(int j=2;j<i/2;j++){
                if(i%j==0)
                    continue outer;
            }
            System.out.print(i+" ");
        }
    }
}
