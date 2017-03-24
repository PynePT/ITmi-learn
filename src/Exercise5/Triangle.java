package Exercise5;

/**
 * Created by HomePC on 24.03.2017.
 */
public class Triangle extends Shape {
    private double a;;
    private double h=((a*Math.sqrt(3))/2);
    Triangle (int a){this.a=a;}
    public int getPerimetr() {return (int)(a+a+a);}
    public int getArea() {return(int) (0.5*(a*h));}
}
