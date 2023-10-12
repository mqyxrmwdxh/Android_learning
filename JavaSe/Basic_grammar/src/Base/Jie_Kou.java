package Base;
//接口类interface,可以多继承,没有构造方法,只能有抽象方法和常量
public interface Jie_Kou {
    //抽象类中所有方法定义都是public abstract
    void fun();//折其实为public abstract
    //protected abstract void go();//此处不允许使用修饰符 'protected'
    //属性都是public static final
    int age=40;
}
//接口间没有继承关系强转又是可以，运行不会出错。但有时会报classexception的错