package package_case.test;//在包里就必须写这个,一般公司域名倒置为包名，各个包不要有重名
import java.util.Date;//类似于引入头文件，必须写在package后面
//import java.sql.Date;
import  java.sql.*;//将包里面所有类导入
//静态导入包
import static java.lang.Math.random;
public class import_case {
    public static void  main(String[]args){
        Date a;//这里是util的Date
        java.sql.Date b;//重名时加上包名
        random();
    }
}
