package Base;
public class Method {
    public static void main(String[] args) {
        int sum=Max(1,5);
        System.out.println(sum);

    }
    public static int  Add(int val1,int val2){
        return val1+val2;
    }
    public static int  Add(int val1,int val2,int val3){//重载,跟c++一样
        return val1+val2+val3;
    }
    public static int Max(int a,int b){
        if(a>b)
            return a;
        else
            return b;
    }
}
