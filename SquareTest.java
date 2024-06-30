import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SquareTest {

	@Test
    public void testConstructorPointA() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);

        assertEquals(A, square.A);
    }

    @Test
    public void testConstructorPointB() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);

        assertEquals(B, square.B);
    }

    @Test
    public void testConstructorPointC() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);

        assertEquals(C, square.C);
    }

    @Test
    public void testConstructorPointD() {
    	// creating points
        Point A = new Point(0, 0); 
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);

        assertEquals(D, square.D);
    }

    @Test
    public void testPerimeter() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);

        double expectedPerimeter = 2 * A.distance(B) + 2 * A.distance(C);
        assertEquals(expectedPerimeter, square.perimeter(), 1e-9);
    }

    @Test
    public void testArea() {
        Point A = new Point(0, 0);
        Point B = new Point(0, 1);
        Point C = new Point(1, 1);
        Point D = new Point(1, 0);
        Sqaure square = new Sqaure(A, B, C, D);
        
        double expectedArea = A.distance(B) * A.distance(C);
        assertEquals(expectedArea, square.area(), 1e-9);
    }
}
