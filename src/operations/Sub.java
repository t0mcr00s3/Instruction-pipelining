package operations;

public class Sub extends Operation{
    
    public Sub(int a, int b) {
        super(a, b);
    }

    @Override
    public void run(){
        this.total = this.a - this.b;
    }
}