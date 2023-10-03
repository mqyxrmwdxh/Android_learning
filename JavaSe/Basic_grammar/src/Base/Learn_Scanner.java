package Base;
import java.util.Scanner;
public class Learn_Scanner {
    public static void main(String[] args) {
        //创建一个扫描器方法，用于接收键盘数据
        Scanner scanner=new Scanner(System.in);
        System.out.println("使用next方式接收：");
        //判断用户有没有输入字符串
        if(scanner.hasNext()){//hasNext看还有没有输入
            String str=scanner.next();//next接收输入
            //输入有效字符前遇到的字符会去掉，之后的会识别为分隔符或结束符
            System.out.println("输入的内容："+str);
        }

        System.out.println("使用nextLine方式接收：");
        while(scanner.hasNextLine()){
            String str=scanner.nextLine();//可以空格
            str.equals("sf");//判断字符串是否相等
            //以enter为结束符会得到enter之前的所有字符
            System.out.println("输入的内容："+str);
        }
        int i=0;
        float f=0.0f;
        System.out.println("请输入整数");
        if(scanner.hasNextInt()){
            i=scanner.nextInt();
            System.out.println("输入的整数"+i);
        }
        System.out.println("请输入小数");
        if(scanner.hasNextFloat()){
            f=scanner.nextFloat();
            System.out.println("输入的小数"+f);
        }
        //print输出不会换行println输出会换行
        scanner.close();//凡是IO类不关闭会一直占用资源，需要关闭
    }
}
