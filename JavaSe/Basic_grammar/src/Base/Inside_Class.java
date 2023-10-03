package Base;

public class Inside_Class {
    private int id;
    public void fun(){
        System.out.println("这是外部类的方法");
    }
    class Inner{//默认public
        public void in(){
            System.out.println("这是内部类");
            id=5;
        }
    }
    public static class A{
        //id=6;错误
    }
    public void Fun(){
        class D{//局部内部类，不能用修饰符，此处不允许使用修饰符 'public'，此处不允许使用修饰符 'static'

        }
    }
}
//一个java类可以有多个class类，但只能有一个public class
 class B{//不能用修饰符，此处不允许使用修饰符 'public'，此处不允许使用修饰符 'static'

}