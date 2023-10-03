package Base;

public class Java_Expection {
    public static void main(String[] args) {
        int a=1;
        int b=1;
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            System.out.println("除数不能为0");
        }catch(Error f){

        }
        catch(Throwable J){//catch里的捕获异常类范围必须递增的

        }
        finally{
            System.out.println("finally");
        }
        try {
            new Java_Expection().Mul(2,0);
        } catch (ArithmeticException e) {
            throw new RuntimeException(e);
        }
    }
    //假设方法中处理不了异常，就抛出给catch
    public void Mul(int M,int L)throws ArithmeticException{
        if(L==0){
            throw new ArithmeticException();//主动抛出异常，一把在方法中使用
        }
    }
}
