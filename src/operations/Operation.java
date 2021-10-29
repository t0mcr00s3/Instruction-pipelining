package operations;

public class Operation extends Thread{
    protected int a;
    protected int b;
    protected int total;

    public Operation(int a, int b){
        this.a = a;
        this.b = b;
    }

    public void run(){
        ;
    }

    public int getTotal(){
        return this.total;
    }
}