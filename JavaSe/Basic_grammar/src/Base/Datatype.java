package Base;

public class Datatype {
    public static void main(String[] args)
    {
        String a="agfa";
        System.out.println(a);
        //JAVA是强类型语言，数据要精确
        byte b= 12;
        boolean c=true;
        float d= 12.2f;//必须加F或f不然报错
        long e= 55L;//L或l
        double f=5.555;
        char g='在';//可以是一个汉字,char与C语言不同有2个字节
        String name="asf";//字符串，类，不是关键字
        System.out.println((int)g);
        //强制转换 (类型)变量名 优先级高到低
        //自动转换 低到高char-->byte-->short-->int-->long-->float-->double
        double f1=55;
        int s=(int)55.2;
        //布尔值不能转换
        //不能将对象类型转为不相干的类型
        //JDK7特性，数字之间可以用下划线分割
        int money=10_000_000;
        System.out.println(money);
    }
}
