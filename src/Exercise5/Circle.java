package Exercise5;

/**
 * Created by HomePC on 22.03.2017.
 */
public class Circle extends Shape{
    private double P1=Math.PI;
    private int r;
    Circle(int r){
        this.r=r;
    }
    public int getPerimetr(){
        return(int)(2*P1*r);
    }
    public int getArea(){
        return (int)(P1*r*r);
    }
}

