package Base;

public class Variate {
    String name;//实例对象,从属于对象,不初始化为默认值Boolean默认为FALSE
    int age;
    boolean flag;
    //类变量 static
    static  double salary=25000;
    public static void main(String []arg)//main方法
    {
        byte a=1,b=3;//局部变量
        //byte c=a+b;报错编译错误，按照 int 结果，需要强制转换
        //byte d=(byte)a+(byte)b;报错编译错误！两个 byte 、short 、char 相加还是按 int 算
        byte c= (byte) (a+b);
        //System.out.println(c);
        byte b4 = 1+3;// 字面量运算，编译期间替换为 4，字面量 4
        //byte b4 = 4; 不超过 byte 就可以赋值
       // System.out.println(b4);

        Variate n=new Variate();
//        System.out.println(n.name);
//        System.out.println(n.age);
//        System.out.println(n.flag);

        //常量final
        final double PI=3.14;
        //PI=6.6;报错

        //字符串连接符 + ,String
        int val1=10;
        int val2=20;
        System.out.println(val1+val2);//30
        System.out.println(""+val1+val2);//1020,将val1和val2转化为String再拼接
        System.out.println(val1+val2+"");//30先运算再转化String
    }
    //其他方法
    //public int add(int val1,int val2){
//        return val1+val2;
//    }
}
