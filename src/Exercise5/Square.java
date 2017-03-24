package Exercise5;

import sun.security.util.Length;

/**
 * Created by HomePC on 24.03.2017.
 */
public class Square extends Shape {
private double l;
Square (int l){this.l=l;}
public int getPerimetr() { return (int) (4*l);}
public int getArea() {  return (int)(l*l); }

}
