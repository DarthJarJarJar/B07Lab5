public class Sqaure {

    Point A;
    Point B;
    Point C;
    Point D;

    public Sqaure (Point A, Point B, Point C, Point D){
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public double perimeter(){
        return ((2 * A.distance(B)) +(2 * A.distance(C)));
    }

    public double area(){
        return (A.distance(B) * A.distance(C));
    }

}
