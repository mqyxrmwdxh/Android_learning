package Base;
//实现接口类，重写方法,多继承
public class Jie_Kou_Implement implements Jie_Kou,Another_Jie_Kou{//如果实现类不是抽象的，那么就必须实现
    @Override
    public void fun() {

    }

    @Override
    public void sad() {

    }
}
class Animal{

}
interface Flay{
    public abstract void Fly();
}
class ins extends Animal implements Flay{
    public void Fly(){
        System.out.println("I can fly");
    }
}
