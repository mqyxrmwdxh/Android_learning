package Base;

public class variabel_parameters {
    public static void main(String[] args) {
        variabel_parameters a=new variabel_parameters();
        a.test(1.0,new int[]{65,4,6});
    }
    public void test(double a,int...i){//可变参数，必须在最右边,这个参数表示第一个参数要是double类型
        // ，之后的参数为数目不确定的int类型,数目可以为0
        System.out.println(a);
    }
}
