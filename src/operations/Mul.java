package operations;

public class Mul extends Operation{
       
    public Mul(int a, int b) {
        super(a, b);
    }

    @Override
    public
    void Calculate(){
        this.total = this.a * this.b;
    } 
}