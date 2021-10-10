package operations;

public class Sub extends Operation{
    
    public Sub(int a, int b) {
        super(a, b);
    }

    @Override
    public
    void Calculate(){
        this.total = this.a - this.b;
    }
}