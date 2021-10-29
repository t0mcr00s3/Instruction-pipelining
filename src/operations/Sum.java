package operations;

public class Sum extends Operation{
    
    public Sum(int a, int b) {
        super(a, b);
    }

    @Override
    public void run(){
        this.total = this.a + this.b;
    }
}