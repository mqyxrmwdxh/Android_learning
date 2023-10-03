package Base;
//继承Expection,就是自定义异常类
public class MyExpection extends Exception{
    private int detail;
    public MyExpection(int a){
        detail=a;
    }

    @Override
    public String toString() {
        return "MyExpection{" +
                "detail=" + detail +
                '}';
    }
}
