package Base;
//在java类所有类都直接或间接继承object类
//final类不能继承
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
}
