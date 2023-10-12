package overequals;

public class anonclass {//匿名内部类是局部类的一种
    static class inner1{//静态内部类

    }
    class inner2{//实例内部类

    }
    public void dosomething(){
        class inner3{//局部内部类

        }
    }
    public void doother(){
        //dosomething()中的inner3在此方法中不能用
    }

    public static void main(String[] args) {
        math m=new math();
        m.mysum(new computer() {//匿名内部类
            @Override
            public int sum(int a, int b) {
                return a+b;
            }
        }, 10, 10);
    }
}
interface computer{
    int sum(int a,int b);
}
/*class imcom implements computer{
   public int sum(int a,int b){
        return a+b;
    }
}*/
class math{
    public void mysum(computer c,int x,int y){
       int val= c.sum(x,y);
        System.out.println(val);
    }
}