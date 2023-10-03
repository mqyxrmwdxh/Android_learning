package Base;
//abstract 抽象类，Java类只能单继承，但接口可以多继承
public abstract class Lei_Abstact {//不能new,可以有具体实现和普通方法，接口只能有抽象方法
    public abstract void DoSomrthing();//抽象方法,abstract方法在抽象类中不能有实现，只能子类重写。不像c++能有函数主体
    public void Fun(){}
}
