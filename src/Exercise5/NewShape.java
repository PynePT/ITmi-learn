package Exercise5;

/**
 * Created by HomePC on 22.03.2017.
 */
public class NewShape {
    public static void main(String[] args) {
        Circle circle=new Circle(8);
        Square square=new Square(6);
        Triangle triangle=new Triangle(9);
        System.out.println("Периметр равен "+ circle.getPerimetr());
        System.out.println("Площадь равна " + circle.getArea());
        System.out.println("Периметр равен "+ square.getPerimetr());
        System.out.println("Площадь равна " + square.getArea());
        System.out.println("Периметр равен "+ triangle.getPerimetr());
        System.out.println("Площадь равна " + triangle.getArea());


    }
}

