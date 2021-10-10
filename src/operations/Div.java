package operations;

public class Div extends Operation{
       
    public Div(int a, int b) {
        super(a, b);
    }

    @Override
    public
    void Calculate(){
        this.total = this.a / this.b;
    } 
}