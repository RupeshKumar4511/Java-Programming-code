package P1;
public class TwoDim {
    private int x;
    private int y;
    public TwoDim(){}
    
    public TwoDim(int x,int y) {
     this.x=x;
     this.y =y;
    }

    

    public int getx(){
        return x;
    }

    public int gety(){
        return y;
    }

    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}