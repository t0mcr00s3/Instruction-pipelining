package operations;

public class Div extends Operation{
       
    public Div(int a, int b) {
        super(a, b);
    }

    @Override
    public
    void run(){
        this.total = this.a / this.b;
    } 
}