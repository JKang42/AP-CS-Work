import java.util.ArrayList; 

public class ShapeCollection
{
    private ArrayList<Shape> ShapeList = new ArrayList<Shape> (); 
    
    public void addShape (Shape x)
    {
       ShapeList.add(x);
       for (Shape s : ShapeList)
       {
           System.out.println(s.getname());
       }
    }


    public int numberOfSides(String shapeName)
    {
        for (Shape s : ShapeList)
        {
            if (s.getname() == shapeName)
            {
                System.out.println(s.getsides());
                return s.getsides();
            }
            
        }   
        
        System.out.println("-1 means no shape found");
        return -1;
    }
    
    public double averageSide()
    {
        double total = ShapeList.size(); 
        double sum = 0; 
        
        for (Shape s : ShapeList)
        {
            sum += s.getsides(); 
        }
        
        System.out.println(sum/total);
        return sum/total; 
    }
    
    
    public ArrayList<Shape> shapeEven()
    {
        ArrayList<Shape> even = new ArrayList<Shape> (); 
        for (Shape s : ShapeList) 
        {
            if (s.getsides() % 2 == 0) 
            {
                even.add(s); 

            }

        }
        
        System.out.println(even); 
        return even; 
                 
    }
    
    
    public static void main (String[]args)
    {
        Shape square = new Shape("Square", 4); 
        Shape triangle = new Shape("Triangle", 3); 
        Shape pentagon = new Shape("Pentagon", 5);
        Shape circle = new Shape("Circle", 0);
        
        ShapeCollection collectionofshapes = new ShapeCollection(); 
        
        collectionofshapes.addShape(square);
        collectionofshapes.addShape(triangle);
        collectionofshapes.addShape(pentagon);
        collectionofshapes.addShape(circle);
     
    }
}