package operations;

public class Mul extends Operation{
       
    public Mul(int a, int b) {
        super(a, b);
    }

    @Override
    public
    void run(){
        this.total = this.a * this.b;
    } 
}