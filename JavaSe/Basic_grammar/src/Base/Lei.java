package Base;
//在java类所有类都直接或间接继承object类
//final类不能继承
//除了父类构造和private都继承  ;

public class Lei {
    String name;
    public Lei(){
        this.name="jack";
        System.out.println("fg");
    }
    public Lei(String name){
        this.name=name;
    }
     public void Do(){
        System.out.println(this.name+"do");
    }
    public int Writeagin(){
        System.out.println("father");
        return 0;
    }
    public void read(){
        System.out.println("father's read");
    }
    //public void Test1010();不是抽象方法就要写方法体
    //public abstract void fuhn();//抽象方法要在抽象类或接口中
}
//            类内部        同一个包        不同包的子类      同一个工程
// private     Yes

// 缺省        Yes         Yes
// protected   Yes         Yes              Yes
// public      Yes         Yes              Yes           Yes
