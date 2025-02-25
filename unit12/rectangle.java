public class Rectangle {
    private String name;
    private double height;
    private double width;

    public Rectangle(String name, double height, double width) {
        this.name = name;
        this.height = height;
        this.width = width;
    }


    public double getHeight() {
        return this.height;
    }

    public double getWidth() {
        return this.width;
    }

    public String getName() {
        return this.name;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getArea() {
        return height * width;
    }

    public static double averagePerimeter(Rectangle[][] rectangles) {
        double total = 0;
        int count = 0;

        for (Rectangle[] row : rectangles) {
            for (Rectangle rect : row) {
                total += rect.getPerimeter();
                count++;
            }
        }
        return total / count;
    }

    public static Rectangle findMaxAreaRectangle(Rectangle[][] rectangles) {
        double maxArea = 0;
        Rectangle maxRect = new Rectangle (" ", 0, 0);

        for (Rectangle[] row : rectangles) {
            for (Rectangle rect : row) {
                if (rect.getArea() > maxArea) {
                    maxArea = rect.getArea();
                    maxRect = rect;
                }
            }
        }
        return maxRect;
    }

  
    public static void main(String[] args) {
 
        Rectangle r1 = new Rectangle("Rect1", 4, 5);
        Rectangle r2 = new Rectangle("Rect2", 6, 7);
        Rectangle r3 = new Rectangle("Rect3", 3, 8);
        Rectangle r4 = new Rectangle("Rect4", 5, 5);

        Rectangle[][] rectangles = {
            {r1, r2},
            {r3, r4}
        };

    
        System.out.println(r1.getName() + " Perimeter: " + r1.getPerimeter() + " Area: " + r1.getArea());
        System.out.println(r2.getName() + " Perimeter: " + r2.getPerimeter() + " Area: " + r2.getArea());
        System.out.println(r3.getName() + " Perimeter: " + r3.getPerimeter() + " Area: " + r3.getArea());
        System.out.println(r4.getName() + " Perimeter: " + r4.getPerimeter() + " Area: " + r4.getArea());


        System.out.println("Average Perimeter: " + averagePerimeter(rectangles));

    
        Rectangle maxRect = findMaxAreaRectangle(rectangles);
        if (maxRect != null) {
            System.out.println("Rectangle with max area: " + maxRect.getName() + " - Area: " + maxRect.getArea());
        } else {
            System.out.println("No rectangles found.");
        }
    }
}
