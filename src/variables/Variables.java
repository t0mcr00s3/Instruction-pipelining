package variables;

public class Variables {
    private final int A = 2;
    private final int B = 3;
    private final int C;
    private final int D;
    private final int E;
    private final int H;

    public Variables(int c, int d, int e, int h){
        this.C = c;
        this.D = d;
        this.E = e;
        this.H = h;
    }

    public final int getA(){
        return this.A;
    }

    public final int getB(){
        return this.B;
    }

    public final int getC(){
        return this.C;
    }

    public final int getD(){
        return this.D;
    }

    public final int getE(){
        return this.E;
    }

    public final int getH(){
        return this.H;
    }

}
