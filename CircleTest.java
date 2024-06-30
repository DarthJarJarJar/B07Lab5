import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;




class CircleTest{
    @Test
    void testConstructor1() {
            
        Point expectedCenter = new Point (0.0, 0.0); 
        double expectedRadius = 3.0; 
            
        Circle new_circle = new Circle(expectedCenter, expectedRadius); 
        assertEquals(expectedCenter, new_circle.center);
        
    }

    @Test
    void testConstructor2() {
            

        Point expectedCenter = new Point (0.0, 0.0); 
        double expectedRadius = 3.0; 
            
        Circle new_circle = new Circle(expectedCenter, expectedRadius); 
        assertEquals(expectedRadius, new_circle.radius, 0.0001);
        
    }

    @Test
    void testPerimeter(){
        Point center = new Point(0.0, 0.0); 
        Circle circle1 = new Circle(center, 3.0); 
        double perimeter = circle1.perimeter(); 
        assertEquals(18.849, perimeter, 0.0001); 
        
    }

    @Test
    void testArea(){
        Point center = new Point(0.0, 0.0); 
        Circle circle1 = new Circle(center, 3.0); 
        double area = circle1.area(); 
        assertEquals(28.2735, area, 0.0001);
    }

}




