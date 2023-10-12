package Base;
//abstract 抽象类，Java类只能单继承，但接口可以多继承
//final和abstract不能一起使用，因为final类无法继承而抽象类本来就是用来继承实现的
//private和abstract也不能一起使用
public abstract class Lei_Abstact {//不能new,有构造方法给子类用,可以有具体实现和普通方法，接口只能有抽象方法和常量
    public abstract void DoSomrthing();//抽象方法,abstract方法在抽象类中不能有实现，只能子类重写。不像c++能有函数主体
    public void Fun(){
        System.out.println("抽象类可以有非抽象方法与属性");
    }
    int a;
}
