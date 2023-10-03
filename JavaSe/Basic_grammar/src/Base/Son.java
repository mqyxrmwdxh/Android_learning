package Base;

public class Son extends  Lei{//继承
    {
        System.out.println("匿名代码块");
    }
    static{
        System.out.println("静态代码块");
    }
    public Son(){
        super();
        System.out.println("sg");
        name="dd";
        //this();//调用本类构造函数，在第一行
        //super();//调用父类构造，可写可不写，'super()' 调用必须是构造函数主体中的第一条语句
    }

    @Override
    public int Writeagin() {
        System.out.println("son");
        return 1;
    }
    public void read(){
        System.out.println("son's read");
    }//重写，修饰符范围可以扩大不能缩小，抛出异常范围能小不能大
    private String name="Mike";
    public void printname(String name){
        System.out.println(name);
        System.out.println(this.name);
        System.out.println(super.name);//父类的name
    }

}
