package P2;
import P1.TwoDim;
    
public class ThreeDim extends TwoDim {
    private int x;
    private int y;
    private int z;

    public ThreeDim(TwoDim twoDim, int z) {
        super(twoDim.getx(), twoDim.gety());
        this.z = z;
    }
    
    public ThreeDim(int x, int y, int z){
        super(x, y);
        this.z=z;
    }

    public int getz() {
        return z;
    }
    @Override
    public String toString(){
        return "x = " + super.getx() + ", y = " + super.gety() + ", z = " + z;
    }
}