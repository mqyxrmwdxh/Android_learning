package Base;
import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        //int a[3]={1,5,6};//报错，[]不能填数字
        //这两种才是数组初始化正确写法，java中一般使用第一种,静态初始化
        int[] b={1,5};
        int c[]={1,5,6};
        int[][] g={{1,5},{3,4},{5}};//每一维长度不一定要相同
        //System.out.println(g[2][1]);//报错
        //也可以这样，动态初始化，默认值0
        int[] d=new int[10];
        int[] e;
        int[][] f=new int[2][5];
        e=new int[5];
//        for(int i=0;i<c.length;i++){
//            System.out.println(c[i]);
//        }
//        for(int x:c){
//            System.out.println(x);
//        }
        Arrays j=null;
        //System.out.println(j.toString(g[0]));
        //System.out.println(Arrays.toString(g[1]));
        Arrays.fill(e,5);
        //Son s=new Son();
        //s.printname("Tom");
        //Lei k=new Son();
        //k.read();
        //((Son)k).printname("sakjfh");
//        Inside_Class in=new Inside_Class();
//        Inside_Class.Inner iin=in.new Inner();
//        iin.in();
        new Apple().eat();//匿名初始化
        new User(){
            @Override
            public void hello() {

            }
        };
    }

}
class Apple{
    public void eat(){
        System.out.println("d");
    }
}
interface User{
    void hello();
}
